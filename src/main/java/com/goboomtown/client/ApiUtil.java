package com.goboomtown.client;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;
import io.swagger.client.api.IssuesApi;
import io.swagger.client.api.MerchantsApi;
import io.swagger.client.api.ProvidersApi;
import io.swagger.client.auth.ApiKeyAuth;
import org.glassfish.jersey.uri.internal.JerseyUriBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.crypto.Mac;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.UriBuilder;
import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by jd on 3/15/2016.
 */
public class ApiUtil {
    private static final Logger logger = LoggerFactory.getLogger(ApiUtil.class);

    private static final String BASE_PATH = "/api/v2";

    private static final Mac sha256_HMAC;
    static {
        try {
            sha256_HMAC = Mac.getInstance("HmacSHA256");
            sha256_HMAC.init(new javax.crypto.spec.SecretKeySpec(Constants.KEY.getBytes("UTF-8"), "HmacSHA256"));
        } catch (InvalidKeyException e) {
            throw new ExceptionInInitializerError(e);
        } catch (NoSuchAlgorithmException e) {
            throw new ExceptionInInitializerError(e);
        } catch (UnsupportedEncodingException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    private static String encode(String data) throws Exception {
        logger.trace("encode({})", data);
        return DatatypeConverter.printBase64Binary(sha256_HMAC.doFinal(data.getBytes("UTF-8")));
    }

    private static ApiClient mkApiClient() {
        ApiClient apiClient = new ApiClient() {
            @Override
            public <T> T invokeAPI(String path, String method, List<Pair> queryParams, Object body, Map<String, String> headerParams, Map<String, Object> formParams, String accept, String contentType, String[] authNames, GenericType<T> returnType) throws ApiException {
                String dt = Constants.DATE_FORMAT.format(new Date());

                ApiKeyAuth apiToken = (ApiKeyAuth)getAuthentication("X-Boomtown-Token");
                apiToken.setApiKey(Constants.TOKEN);

                ApiKeyAuth apiSignature = (ApiKeyAuth)getAuthentication("X-Boomtown-Signature");
                try {
                    UriBuilder uriBuilder = new JerseyUriBuilder();
                    uriBuilder.path(BASE_PATH + path);
                    for (Pair queryParam : queryParams) {
                        uriBuilder = uriBuilder.queryParam(queryParam.getName(), queryParam.getValue());
                    }
                    apiSignature.setApiKey(encode(uriBuilder.toTemplate() + ':' + dt));
                } catch (Exception e) {
                    throw new ApiException(e);
                }

                ApiKeyAuth apiDate = (ApiKeyAuth)getAuthentication("X-Boomtown-Date");
                apiDate.setApiKey(dt);

                return super.invokeAPI(path, method, queryParams, body, headerParams, formParams, accept, contentType, authNames, returnType);
            }
        };
        apiClient.setDateFormat(Constants.DATE_FORMAT_API);
        return apiClient;
    }

    public static ProvidersApi getProvidersApi() {
        return new ProvidersApi(mkApiClient());
    }

    public static MerchantsApi getMerchantsApi() {
        return new MerchantsApi(mkApiClient());
    }

    public static IssuesApi getIssuesApi() {
        return new IssuesApi(mkApiClient());
    }
}
