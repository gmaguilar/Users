# BudgetApi

All URIs are relative to *http://localhost:8083*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**usersUserIdBudgetGet**](BudgetApi.md#usersUserIdBudgetGet) | **GET** /users/{userId}/budget | Get user budget |
| [**usersUserIdBudgetPut**](BudgetApi.md#usersUserIdBudgetPut) | **PUT** /users/{userId}/budget | Update user budget |


<a id="usersUserIdBudgetGet"></a>
# **usersUserIdBudgetGet**
> UsersUserIdBudgetGet200Response usersUserIdBudgetGet(userId)

Get user budget

Retrieves the budget information for a specific user. Only accessible by the user or an admin. It cannot be negative

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BudgetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    BudgetApi apiInstance = new BudgetApi(defaultClient);
    UUID userId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000"); // UUID | The ID of the user.
    try {
      UsersUserIdBudgetGet200Response result = apiInstance.usersUserIdBudgetGet(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetApi#usersUserIdBudgetGet");
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

[**UsersUserIdBudgetGet200Response**](UsersUserIdBudgetGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Budget retrieved successfully. |  -  |
| **400** | Bad Request. The request parameters are invalid. |  -  |
| **401** | Unauthorized. The request requires user authentication. |  -  |
| **403** | Forbidden. The user does not have the necessary permissions to access this endpoint. |  -  |
| **404** | Not Found. The requested resource could not be found. |  -  |
| **500** | Internal Server Error. An unexpected error occurred on the server. |  -  |

<a id="usersUserIdBudgetPut"></a>
# **usersUserIdBudgetPut**
> UsersUserIdBudgetPutRequest usersUserIdBudgetPut(userId, usersUserIdBudgetPutRequest)

Update user budget

Updates the budget information for a specific user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BudgetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    BudgetApi apiInstance = new BudgetApi(defaultClient);
    UUID userId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000"); // UUID | The ID of the user.
    UsersUserIdBudgetPutRequest usersUserIdBudgetPutRequest = new UsersUserIdBudgetPutRequest(); // UsersUserIdBudgetPutRequest | 
    try {
      UsersUserIdBudgetPutRequest result = apiInstance.usersUserIdBudgetPut(userId, usersUserIdBudgetPutRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BudgetApi#usersUserIdBudgetPut");
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
| **usersUserIdBudgetPutRequest** | [**UsersUserIdBudgetPutRequest**](UsersUserIdBudgetPutRequest.md)|  | |

### Return type

[**UsersUserIdBudgetPutRequest**](UsersUserIdBudgetPutRequest.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Budget updated successfully. |  -  |
| **400** | Bad Request. The request parameters are invalid. |  -  |
| **401** | Unauthorized. The request requires user authentication. |  -  |
| **403** | Forbidden. The user does not have the necessary permissions to access this endpoint. |  -  |
| **404** | Not Found. The requested resource could not be found. |  -  |
| **500** | Internal Server Error. An unexpected error occurred on the server. |  -  |

