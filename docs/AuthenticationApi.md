# AuthenticationApi

All URIs are relative to *http://localhost:8083*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**usersAuthLoginPost**](AuthenticationApi.md#usersAuthLoginPost) | **POST** /users/auth/login | User login. |
| [**usersAuthLogoutPost**](AuthenticationApi.md#usersAuthLogoutPost) | **POST** /users/auth/logout | User logout. |


<a id="usersAuthLoginPost"></a>
# **usersAuthLoginPost**
> LoginResponse usersAuthLoginPost(loginRequest)

User login.

Authenticates an user. If the users credentials are valid, a successful login response is returned and will redirect the user to the profile page.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    LoginRequest loginRequest = new LoginRequest(); // LoginRequest | 
    try {
      LoginResponse result = apiInstance.usersAuthLoginPost(loginRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#usersAuthLoginPost");
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
| **loginRequest** | [**LoginRequest**](LoginRequest.md)|  | |

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Login successful. |  -  |
| **400** | Bad Request. The request parameters are invalid. |  -  |
| **401** | Unauthorized. The request requires user authentication. |  -  |

<a id="usersAuthLogoutPost"></a>
# **usersAuthLogoutPost**
> LogoutResponse usersAuthLogoutPost()

User logout.

Logs out an authenticated user

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthenticationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    AuthenticationApi apiInstance = new AuthenticationApi(defaultClient);
    try {
      LogoutResponse result = apiInstance.usersAuthLogoutPost();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthenticationApi#usersAuthLogoutPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LogoutResponse**](LogoutResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Logout successful. |  -  |
| **401** | Unauthorized. The request requires user authentication. |  -  |

