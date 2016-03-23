package com.goboomtown.sdk.swagger.api;

import com.goboomtown.sdk.swagger.ApiException;
import com.goboomtown.sdk.swagger.ApiClient;
import com.goboomtown.sdk.swagger.Configuration;
import com.goboomtown.sdk.swagger.Pair;

import javax.ws.rs.core.GenericType;

import com.goboomtown.sdk.swagger.model.ProviderResponse;
import com.goboomtown.sdk.swagger.model.Error;
import com.goboomtown.sdk.swagger.model.MemberResponse;
import com.goboomtown.sdk.swagger.model.ProviderTeamResponse;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-23T11:55:09.982-06:00")

public class ProvidersApi {
  private ApiClient apiClient;

  public ProvidersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public ProvidersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Get your Provider
   * Returns a *Provider* object.
   * @return ProviderResponse
   * @throws ApiException if fails to make API call
   */
  public ProviderResponse getProvider() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/providers/get".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "X-Boomtown-Date", "X-Boomtown-Signature", "X-Boomtown-Token" };

    
    GenericType<ProviderResponse> localVarReturnType = new GenericType<ProviderResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a collection of Merchants for your Provider
   * Returns a paginated collection of *Merchant* objects related to your *Provider* object.
   * @return MemberResponse
   * @throws ApiException if fails to make API call
   */
  public MemberResponse getProviderMembers() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/providers/members".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "X-Boomtown-Date", "X-Boomtown-Signature", "X-Boomtown-Token" };

    
    GenericType<MemberResponse> localVarReturnType = new GenericType<MemberResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a Provider Team
   * Returns a *Provider Team* object.
   * @param providerTeamId The primary key of the ProviderTeam
   * @return ProviderTeamResponse
   * @throws ApiException if fails to make API call
   */
  public ProviderTeamResponse getProviderTeam(String providerTeamId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'providerTeamId' is set
    if (providerTeamId == null) {
      throw new ApiException(400, "Missing the required parameter 'providerTeamId' when calling getProviderTeam");
    }
    
    // create path and map variables
    String localVarPath = "/providers/teams/{provider_team_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "provider_team_id" + "\\}", apiClient.escapeString(providerTeamId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "X-Boomtown-Date", "X-Boomtown-Signature", "X-Boomtown-Token" };

    
    GenericType<ProviderTeamResponse> localVarReturnType = new GenericType<ProviderTeamResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a collection of Teams for your Provider
   * Returns a paginated collection of *Provider Team* objects related to your *Provider* object.
   * @return ProviderTeamResponse
   * @throws ApiException if fails to make API call
   */
  public ProviderTeamResponse getProviderTeams() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/providers/teams".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "X-Boomtown-Date", "X-Boomtown-Signature", "X-Boomtown-Token" };

    
    GenericType<ProviderTeamResponse> localVarReturnType = new GenericType<ProviderTeamResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}

