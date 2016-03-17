package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import javax.ws.rs.core.GenericType;

import io.swagger.client.model.MemberCreateResponse;
import io.swagger.client.model.Error;
import io.swagger.client.model.MemberCreateRequest;
import io.swagger.client.model.MemberResponse;
import io.swagger.client.model.MemberUserResponse;
import io.swagger.client.model.MemberLocationResponse;
import io.swagger.client.model.EnumerationItemResponse;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-17T14:09:14.476-06:00")

public class MerchantsApi {
  private ApiClient apiClient;

  public MerchantsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public MerchantsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Creates a new Merchant
   * Creates a *Merchant* and optionally *MerchantLocation* and *MerchantUser*
   * @param body The *Merchant* to create
   * @return MemberCreateResponse
   * @throws ApiException if fails to make API call
   */
  public MemberCreateResponse createMember(MemberCreateRequest body) throws ApiException {
    Object localVarPostBody = body;
    
    // verify the required parameter 'body' is set
    if (body == null) {
      throw new ApiException(400, "Missing the required parameter 'body' when calling createMember");
    }
    
    // create path and map variables
    String localVarPath = "/members/create".replaceAll("\\{format\\}","json");

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

    
    GenericType<MemberCreateResponse> localVarReturnType = new GenericType<MemberCreateResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Returns a Merchant
   * Returns a *Merchant* ≈
   * @param memberId The primary key of the *Merchant*
   * @return MemberResponse
   * @throws ApiException if fails to make API call
   */
  public MemberResponse getMember(String memberId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'memberId' is set
    if (memberId == null) {
      throw new ApiException(400, "Missing the required parameter 'memberId' when calling getMember");
    }
    
    // create path and map variables
    String localVarPath = "/members/get/{member_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "member_id" + "\\}", apiClient.escapeString(memberId.toString()));

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
   * Returns a collection of MerchantUsers
   * Returns a collection of *MerchantUsers* belonging to a *MerchantLocation*
   * @param memberId The primary key of the *Merchant*
   * @return MemberUserResponse
   * @throws ApiException if fails to make API call
   */
  public MemberUserResponse getMemberLocationUsers(String memberId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'memberId' is set
    if (memberId == null) {
      throw new ApiException(400, "Missing the required parameter 'memberId' when calling getMemberLocationUsers");
    }
    
    // create path and map variables
    String localVarPath = "/members/location/users/{member_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "member_id" + "\\}", apiClient.escapeString(memberId.toString()));

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

    
    GenericType<MemberUserResponse> localVarReturnType = new GenericType<MemberUserResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Returns a collection of MerchantLocations
   * Returns a collection of *MerchantLocation* records belonging to a *Merchant*
   * @param memberId The primary key of the *Merchant*
   * @param membersLocationsId An optional members_locations_id to filter the results with
   * @return MemberLocationResponse
   * @throws ApiException if fails to make API call
   */
  public MemberLocationResponse getMemberLocations(String memberId, String membersLocationsId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'memberId' is set
    if (memberId == null) {
      throw new ApiException(400, "Missing the required parameter 'memberId' when calling getMemberLocations");
    }
    
    // create path and map variables
    String localVarPath = "/members/location/get/{member_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "member_id" + "\\}", apiClient.escapeString(memberId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "members_locations_id", membersLocationsId));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "X-Boomtown-Date", "X-Boomtown-Signature", "X-Boomtown-Token" };

    
    GenericType<MemberLocationResponse> localVarReturnType = new GenericType<MemberLocationResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Returns collection of industries
   * Returns the industries available for a *Merchant*
   * @return EnumerationItemResponse
   * @throws ApiException if fails to make API call
   */
  public EnumerationItemResponse getMemberMetaIndustries() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/members/meta/industries".replaceAll("\\{format\\}","json");

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

    
    GenericType<EnumerationItemResponse> localVarReturnType = new GenericType<EnumerationItemResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Returns collection of statuses
   * Returns the statuses available for a *Merchant* or *MerchantUsers*
   * @return EnumerationItemResponse
   * @throws ApiException if fails to make API call
   */
  public EnumerationItemResponse getMemberMetaStatuses() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/members/meta/statuses".replaceAll("\\{format\\}","json");

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

    
    GenericType<EnumerationItemResponse> localVarReturnType = new GenericType<EnumerationItemResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Returnsa a collection of MerchantUsers
   * Returns a collection of *MerchantUser* records belonging to a *Merchant*
   * @param memberId The id of the *Merchant*
   * @param userId Optional user_id to filter the results with
   * @return MemberUserResponse
   * @throws ApiException if fails to make API call
   */
  public MemberUserResponse getMemberUsers(String memberId, String userId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'memberId' is set
    if (memberId == null) {
      throw new ApiException(400, "Missing the required parameter 'memberId' when calling getMemberUsers");
    }
    
    // create path and map variables
    String localVarPath = "/members/user/get/{member_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "member_id" + "\\}", apiClient.escapeString(memberId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "user_id", userId));
    

    

    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "X-Boomtown-Date", "X-Boomtown-Signature", "X-Boomtown-Token" };

    
    GenericType<MemberUserResponse> localVarReturnType = new GenericType<MemberUserResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
}

