package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import javax.ws.rs.core.GenericType;

import io.swagger.client.model.ProviderResponse;
import io.swagger.client.model.Error;
import io.swagger.client.model.MemberResponse;
import io.swagger.client.model.ProviderTeamResponse;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-17T14:09:14.476-06:00")

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
   * Returns your Provider
   * Returns your *Provider* record
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
   * Returns Merchants
   * Returns collection of related *Merchant* records
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
   * Returns a ProviderTeam
   * Returns a *ProviderTeam* record
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
   * Returns your ProviderTeams
   * Returns a collection of *ProviderTeam* records
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

