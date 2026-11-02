# GroupsApi

All URIs are relative to *http://localhost:8083*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**updateUserGroup**](GroupsApi.md#updateUserGroup) | **PUT** /users/{userId}/group | Update user&#39;s group |


<a id="updateUserGroup"></a>
# **updateUserGroup**
> UpdateUserGroup200Response updateUserGroup(userId, updateGroupUser)

Update user&#39;s group

Updates the group of a specific user. Only administrators can change a user&#39;s group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GroupsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    GroupsApi apiInstance = new GroupsApi(defaultClient);
    UUID userId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000"); // UUID | The ID of the user.
    UpdateGroupUser updateGroupUser = new UpdateGroupUser(); // UpdateGroupUser | 
    try {
      UpdateUserGroup200Response result = apiInstance.updateUserGroup(userId, updateGroupUser);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GroupsApi#updateUserGroup");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **UUID**| The ID of the user. | |
| **updateGroupUser** | [**UpdateGroupUser**](UpdateGroupUser.md)|  | |

### Return type

[**UpdateUserGroup200Response**](UpdateUserGroup200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Group updated successfully. |  -  |
| **400** | Bad Request. The request parameters are invalid. |  -  |
| **401** | Unauthorized. The request requires user authentication. |  -  |
| **403** | Forbidden. The user does not have the necessary permissions to access this endpoint. |  -  |
| **404** | Not Found. The requested resource could not be found. |  -  |
| **500** | Internal Server Error. An unexpected error occurred on the server. |  -  |

