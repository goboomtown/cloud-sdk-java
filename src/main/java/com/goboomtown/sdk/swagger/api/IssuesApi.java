package com.goboomtown.sdk.swagger.api;

import com.goboomtown.sdk.swagger.ApiException;
import com.goboomtown.sdk.swagger.ApiClient;
import com.goboomtown.sdk.swagger.Configuration;
import com.goboomtown.sdk.swagger.Pair;

import javax.ws.rs.core.GenericType;

import com.goboomtown.sdk.swagger.model.Error;
import com.goboomtown.sdk.swagger.model.IssueResponse;
import com.goboomtown.sdk.swagger.model.IssueCreateRequest;
import com.goboomtown.sdk.swagger.model.IssueLogsResponse;
import com.goboomtown.sdk.swagger.model.EnumerationItemResponse;
import com.goboomtown.sdk.swagger.model.IssueStatusesResponse;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-23T11:55:09.982-06:00")

public class IssuesApi {
  private ApiClient apiClient;

  public IssuesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public IssuesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  
  /**
   * Cancel an Issue for a Merchant
   * Transitions an *Issue* to a &#39;Canceled&#39; status in the workflow.
   * @param issueId The primary key of the *Issue*
   * @throws ApiException if fails to make API call
   */
  public void cancelIssue(String issueId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling cancelIssue");
    }
    
    // create path and map variables
    String localVarPath = "/issues/cancel/{issue_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()));

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

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
  /**
   * Create an Issue for a Merchant
   * Creates an *Issue* object related to a *Merchant* object.
   * @param issues The *Issue* to create
   * @return IssueResponse
   * @throws ApiException if fails to make API call
   */
  public IssueResponse createIssue(IssueCreateRequest issues) throws ApiException {
    Object localVarPostBody = issues;
    
    // create path and map variables
    String localVarPath = "/issues/create".replaceAll("\\{format\\}","json");

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

    
    GenericType<IssueResponse> localVarReturnType = new GenericType<IssueResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Add an entry to an Issue&#39;s log
   * Creates a new log entry related to an *Issue* object.
   * @param issueId The primary key of the *Issue*
   * @param notes Notes to log against the *Issue*
   * @return IssueLogsResponse
   * @throws ApiException if fails to make API call
   */
  public IssueLogsResponse createIssueLog(String issueId, String notes) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling createIssueLog");
    }
    
    // verify the required parameter 'notes' is set
    if (notes == null) {
      throw new ApiException(400, "Missing the required parameter 'notes' when calling createIssueLog");
    }
    
    // create path and map variables
    String localVarPath = "/issues/log/create/{issue_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    

    

    if (notes != null)
      localVarFormParams.put("notes", notes);
    

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "X-Boomtown-Date", "X-Boomtown-Signature", "X-Boomtown-Token" };

    
    GenericType<IssueLogsResponse> localVarReturnType = new GenericType<IssueLogsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get an Issue
   * Returns an *Issue* object.
   * @param issueId The primary key of the *Issue*
   * @return IssueResponse
   * @throws ApiException if fails to make API call
   */
  public IssueResponse getIssue(String issueId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling getIssue");
    }
    
    // create path and map variables
    String localVarPath = "/issues/get/{issue_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()));

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

    
    GenericType<IssueResponse> localVarReturnType = new GenericType<IssueResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a collection of all Issue changes
   * Returns a paginated collection of all changes for an *Issue* object.
   * @param issueId The primary key of the *Issue*
   * @return IssueLogsResponse
   * @throws ApiException if fails to make API call
   */
  public IssueLogsResponse getIssueLogs(String issueId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling getIssueLogs");
    }
    
    // create path and map variables
    String localVarPath = "/issues/log/history/{issue_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()));

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

    
    GenericType<IssueLogsResponse> localVarReturnType = new GenericType<IssueLogsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get &#39;Category&#39; dictionary for mapping keys to labels
   * Returns a dictionary for mapping &#39;Category&#39; keys to labels on *Issue* objects.
   * @return EnumerationItemResponse
   * @throws ApiException if fails to make API call
   */
  public EnumerationItemResponse getIssueMetaCategories() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/issues/meta/categories".replaceAll("\\{format\\}","json");

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
   * Get &#39;Resolution&#39; dictionary for mapping keys to labels
   * Returns a dictionary for mapping &#39;Resolution&#39; keys to labels on *Issue* objects.
   * @return EnumerationItemResponse
   * @throws ApiException if fails to make API call
   */
  public EnumerationItemResponse getIssueMetaResolutions() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/issues/meta/resolutions".replaceAll("\\{format\\}","json");

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
   * Get &#39;Status&#39; dictionary for mapping keys to labels
   * Returns a dictionary for mapping &#39;Status&#39; keys to labels on *Issue* objects.
   * @return EnumerationItemResponse
   * @throws ApiException if fails to make API call
   */
  public EnumerationItemResponse getIssueMetaStatuses() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/issues/meta/statuses".replaceAll("\\{format\\}","json");

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
   * Get &#39;Type&#39; dictionary for mapping keys to labels
   * Returns a dictionary for mapping &#39;Type&#39; keys to labels on *Issue* objects.
   * @return EnumerationItemResponse
   * @throws ApiException if fails to make API call
   */
  public EnumerationItemResponse getIssueMetaTypes() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/issues/meta/types".replaceAll("\\{format\\}","json");

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
   * Get a collection of Issue status changes
   * Returns a paginated collection of status changes for an *Issue* object.
   * @param issueId The primary key of the *Issue*
   * @return IssueStatusesResponse
   * @throws ApiException if fails to make API call
   */
  public IssueStatusesResponse getIssueStatusHistory(String issueId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling getIssueStatusHistory");
    }
    
    // create path and map variables
    String localVarPath = "/issues/status/history/{issue_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()));

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

    
    GenericType<IssueStatusesResponse> localVarReturnType = new GenericType<IssueStatusesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Get a collection of Issues
   * Returns a paginated collection of *Issue* objects.
   * @param limit Pagination result limit (defaults to 10)
   * @param start Pagination starting result number (defaults to 0)
   * @param membersId Optionally limit result to this {members_id}
   * @param membersUsersId Optionally limit result to this {members_users_id}
   * @param membersLocationsId Optionally limit result to this {members_locations_id}
   * @return IssueResponse
   * @throws ApiException if fails to make API call
   */
  public IssueResponse getIssues(Integer limit, Integer start, String membersId, String membersUsersId, String membersLocationsId) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/issues/get".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "start", start));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "members_id", membersId));
    
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "members_users_id", membersUsersId));
    
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

    
    GenericType<IssueResponse> localVarReturnType = new GenericType<IssueResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    
  }
  
  /**
   * Resolve an Issue for a Merchant
   * Transitions an *Issue* to a &#39;Resolved&#39; status in the workflow.
   * @param issueId The primary key of the *Issue*
   * @throws ApiException if fails to make API call
   */
  public void resolveIssue(String issueId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'issueId' is set
    if (issueId == null) {
      throw new ApiException(400, "Missing the required parameter 'issueId' when calling resolveIssue");
    }
    
    // create path and map variables
    String localVarPath = "/issues/resolve/{issue_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "issue_id" + "\\}", apiClient.escapeString(issueId.toString()));

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

    
    apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
    
  }
  
}

