# DefaultApi

All URIs are relative to *http://localhost:8083*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteUserById**](DefaultApi.md#deleteUserById) | **DELETE** /users/{userId}/ | Delete a user by ID. |
| [**getUserById**](DefaultApi.md#getUserById) | **GET** /users/{userId}/ | Get a user by ID. |
| [**updateUserPassword**](DefaultApi.md#updateUserPassword) | **PUT** /users/{userId}/password | Update user password |


<a id="deleteUserById"></a>
# **deleteUserById**
> User deleteUserById(userId)

Delete a user by ID.

Delete a user by their unique ID. The user will be removed from the system. The user must be authenticated to perform this action. The group &#39;ADMIN&#39; can delete any user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID userId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000"); // UUID | The ID of the user.
    try {
      User result = apiInstance.deleteUserById(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#deleteUserById");
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

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User deleted successfully. |  -  |
| **401** | Unauthorized. The request requires user authentication. |  -  |
| **403** | Forbidden. The user does not have the necessary permissions to access this endpoint. |  -  |
| **404** | Not Found. The requested resource could not be found. |  -  |
| **503** | Service Unavailable. The server is currently unable to handle the request. |  -  |
| **500** | Internal Server Error. An unexpected error occurred on the server. |  -  |

<a id="getUserById"></a>
# **getUserById**
> User getUserById(userId)

Get a user by ID.

Retrieve a user by their unique ID. The user must be authenticated to perform this action. Only the user themselves or an administrator can retrieve this information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID userId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000"); // UUID | The ID of the user.
    try {
      User result = apiInstance.getUserById(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#getUserById");
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

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User retrieved successfully. |  -  |
| **401** | Unauthorized. The request requires user authentication. |  -  |
| **403** | Forbidden. The user does not have the necessary permissions to access this endpoint. |  -  |
| **404** | Not Found. The requested resource could not be found. |  -  |
| **503** | Service Unavailable. The server is currently unable to handle the request. |  -  |
| **500** | Internal Server Error. An unexpected error occurred on the server. |  -  |

<a id="updateUserPassword"></a>
# **updateUserPassword**
> UpdateUserPassword200Response updateUserPassword(userId, updateUserPasswordRequest)

Update user password

Allows a user to update their password. Only the user themselves or an administrator can perform this action.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    UUID userId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000"); // UUID | The ID of the user.
    UpdateUserPasswordRequest updateUserPasswordRequest = new UpdateUserPasswordRequest(); // UpdateUserPasswordRequest | 
    try {
      UpdateUserPassword200Response result = apiInstance.updateUserPassword(userId, updateUserPasswordRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#updateUserPassword");
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
| **updateUserPasswordRequest** | [**UpdateUserPasswordRequest**](UpdateUserPasswordRequest.md)|  | |

### Return type

[**UpdateUserPassword200Response**](UpdateUserPassword200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Password updated successfully. |  -  |
| **400** | Bad Request. The request parameters are invalid. |  -  |
| **401** | Unauthorized. The request requires user authentication. |  -  |
| **403** | Forbidden. The user does not have the necessary permissions to access this endpoint. |  -  |
| **404** | Not Found. The requested resource could not be found. |  -  |
| **500** | Internal Server Error. An unexpected error occurred on the server. |  -  |

