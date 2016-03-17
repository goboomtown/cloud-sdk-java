package com.goboomtown.sdk;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Pair;
import io.swagger.client.api.IssuesApi;
import io.swagger.client.api.MerchantsApi;
import io.swagger.client.api.ProvidersApi;
import io.swagger.client.auth.ApiKeyAuth;
import org.glassfish.jersey.uri.internal.JerseyUriBuilder;

import javax.crypto.Mac;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.UriBuilder;
import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/**
 * A Java API for interfacing with the underlying--auto-generated--Swagger Java client.
 */
public class ApiUtil {
    public static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
    public static final DateFormat DATE_FORMAT_API = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    static {
        DATE_FORMAT.setTimeZone(TimeZone.getTimeZone("UTC"));
        DATE_FORMAT_API.setTimeZone(TimeZone.getDefault());
    }

    private static final String BASE_PATH = "/api/v2";

    private static Mac sha256_HMAC = null;
    private static String token = null;

    /**
     * Statically initializes ApiUtil.
     *
     * This must be called before using any other static ApiUtil method.
     *
     * @param token A Boomtown Provider API Public Key
     * @param privateKey A Boomtown Provider API Private Key
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     * @throws InvalidKeyException
     */
    public static void initialize(String token, String privateKey) throws NoSuchAlgorithmException, UnsupportedEncodingException, InvalidKeyException {
        if (sha256_HMAC != null) {
            ApiUtil.sha256_HMAC.reset();
            ApiUtil.sha256_HMAC = null;
            ApiUtil.token = null;
        }

        Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
        sha256_HMAC.init(new javax.crypto.spec.SecretKeySpec(privateKey.getBytes("UTF-8"), "HmacSHA256"));

        ApiUtil.token = token;
        ApiUtil.sha256_HMAC = sha256_HMAC;
    }

    /**
     * Returns the ProvidersApi, used for provider-related-API calls.
     *
     * @return A new ProvidersApi instance
     */
    public static ProvidersApi getProvidersApi() {
        return new ProvidersApi(mkApiClient());
    }

    /**
     * Returns the MerchantsApi, used for merchant-related-API calls.
     *
     * @return A new MerchantsApi instance
     */
    public static MerchantsApi getMerchantsApi() {
        return new MerchantsApi(mkApiClient());
    }

    /**
     * Returns the IssuesApi, used for issue-related-API calls.
     *
     * @return A new IssuesAPI instance
     */
    public static IssuesApi getIssuesApi() {
        return new IssuesApi(mkApiClient());
    }

    /**
     * Returns an encoded X-Boomtown-Signature.
     */
    private static String encode(String data) throws Exception {
        return DatatypeConverter.printBase64Binary(sha256_HMAC.doFinal(data.getBytes("UTF-8")));
    }

    /**
     * @return A new ApiClient instance which handles Boomtown api/v2 authentication
     */
    private static ApiClient mkApiClient() {
        if (sha256_HMAC == null || token == null) {
            throw new IllegalStateException("ApiUtil.initialize() required");
        }

        ApiClient apiClient = new ApiClient() {
            @Override
            public <T> T invokeAPI(String path, String method, List<Pair> queryParams, Object body, Map<String, String> headerParams, Map<String, Object> formParams, String accept, String contentType, String[] authNames, GenericType<T> returnType) throws ApiException {
                String dt = DATE_FORMAT.format(new Date());

                ApiKeyAuth apiToken = (ApiKeyAuth)getAuthentication("X-Boomtown-Token");
                apiToken.setApiKey(token);

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
        apiClient.setDateFormat(DATE_FORMAT_API);
        return apiClient;
    }
}
