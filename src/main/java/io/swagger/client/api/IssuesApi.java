package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.ApiClient;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;

import javax.ws.rs.core.GenericType;

import io.swagger.client.model.Error;
import io.swagger.client.model.IssueResponse;
import io.swagger.client.model.Issue;
import io.swagger.client.model.IssueLogsResponse;
import io.swagger.client.model.EnumerationItemResponse;
import io.swagger.client.model.IssueStatusesResponse;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-03-17T14:09:14.476-06:00")

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
   * Set a Issue to a cancelled status
   * Closes a *Issue* with a cancelled status
   * @param issueId The primary key of the *Issue* to cancel.
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
   * Creates a new Issue
   * Creates a new *Issue*
   * @param issues Issue to create
   * @return IssueResponse
   * @throws ApiException if fails to make API call
   */
  public IssueResponse createIssue(Issue issues) throws ApiException {
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
   * Add a log to a Issue
   * Logs notes to an *Issue*
   * @param issueId The primary key of the related *Issue*
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
   * Returns a Issue
   * Returns a *Issue* record
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
   * Returns a collection of IssueLogs
   * Returns a collection of *IssueLog* records
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
   * Returns collection of categories
   * Returns the categories available for an *Issue*
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
   * Returns collection of resolutions
   * Returns the resolutions available for an *Issue*
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
   * Returns collection of statuses
   * Returns the statuses available for an *Issue*
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
   * Returns collection of types
   * Returns the types available for an *Issue*
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
   * Returns a collection of IssueStatuses
   * Returns a collection of *IssueStatuse* records
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
   * Returns a collection of Issues
   * Returns a collection of *Issue* records
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
   * Set a Issue to a resolved status
   * Closes a *Issue* with a resolved status
   * @param issueId The primary key of the *Issue* to resolve.
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

