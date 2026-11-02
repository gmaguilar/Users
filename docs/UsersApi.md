# UsersApi

All URIs are relative to *http://localhost:8083*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUser**](UsersApi.md#createUser) | **POST** /users | Create a new user |
| [**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /users | Delete a user. |
| [**getUserProfile**](UsersApi.md#getUserProfile) | **GET** /users/profile | Get the profile of the authenticated user. |
| [**getUsers**](UsersApi.md#getUsers) | **GET** /users | Retrieve a list of users |
| [**updateUserGroup**](UsersApi.md#updateUserGroup) | **PUT** /users/{userId}/group | Update user&#39;s group |
| [**updateUserQtyWasted**](UsersApi.md#updateUserQtyWasted) | **PATCH** /users/{userId}/qtyWasted | Update user&#39;s qtyWasted |
| [**usersPut**](UsersApi.md#usersPut) | **PUT** /users | Update an existing user. |
| [**usersUserIdBudgetGet**](UsersApi.md#usersUserIdBudgetGet) | **GET** /users/{userId}/budget | Get user budget |


<a id="createUser"></a>
# **createUser**
> User createUser(createUserRequest)

Create a new user

Endpoint to create a new user. The request body must include the user&#39;s name, email, and password. 

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    UsersApi apiInstance = new UsersApi(defaultClient);
    CreateUserRequest createUserRequest = new CreateUserRequest(); // CreateUserRequest | 
    try {
      User result = apiInstance.createUser(createUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#createUser");
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
| **createUserRequest** | [**CreateUserRequest**](CreateUserRequest.md)|  | |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfull operation. User created |  -  |
| **400** | Incorrect datas |  -  |
| **409** | The email is already register. |  -  |
| **500** | Internal server error. An unexpected error occurred on the server. |  -  |
| **503** | Service unavailable. The server is currently unable to handle the request due to temporary overload or maintenance. |  -  |

<a id="deleteUser"></a>
# **deleteUser**
> Success deleteUser(userId)

Delete a user.

Delete an user by their unique ID. The user will be removed from the system. The user must be authenticated to perform this action. The group &#39;ADMIN&#39; can delete any user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    UsersApi apiInstance = new UsersApi(defaultClient);
    UUID userId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000"); // UUID | The ID of the user.
    try {
      Success result = apiInstance.deleteUser(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#deleteUser");
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

[**Success**](Success.md)

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

<a id="getUserProfile"></a>
# **getUserProfile**
> User getUserProfile()

Get the profile of the authenticated user.

Retrieve the profile information of the currently authenticated user. The user must be authenticated to access this endpoint. The endpoint will also communicate with the microservice Category to retrieve additional user information. The system will call the endpoint GET -&gt; /category to obtain the necessary category details. Once the category information is retrieved, it will be included in the user&#39;s profile response.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    UsersApi apiInstance = new UsersApi(defaultClient);
    try {
      User result = apiInstance.getUserProfile();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUserProfile");
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

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Profile retrieved successfully. |  -  |
| **401** | Unauthorized. The request requires user authentication. |  -  |
| **403** | Forbidden. The user does not have the necessary permissions to access this endpoint. |  -  |
| **500** | Internal Server Error. An unexpected error occurred on the server. |  -  |

<a id="getUsers"></a>
# **getUsers**
> List&lt;User&gt; getUsers()

Retrieve a list of users

Retrieve a list of all users. Only administrators have access to this endpoint. This endpoint requires the user to be authenticated. List all the users in the system.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    UsersApi apiInstance = new UsersApi(defaultClient);
    try {
      List<User> result = apiInstance.getUsers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getUsers");
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

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. Returns a list of users. |  -  |
| **401** | Unauthorized. The request requires user authentication. |  -  |
| **403** | Forbidden. The user does not have the necessary permissions to access this endpoint. |  -  |
| **404** | Not Found. The requested resource could not be found. |  -  |
| **503** | Service Unavailable. The server is currently unable to handle the request. |  -  |
| **500** | Internal Server Error. An unexpected error occurred on the server. |  -  |

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
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    UsersApi apiInstance = new UsersApi(defaultClient);
    UUID userId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000"); // UUID | The ID of the user.
    UpdateGroupUser updateGroupUser = new UpdateGroupUser(); // UpdateGroupUser | 
    try {
      UpdateUserGroup200Response result = apiInstance.updateUserGroup(userId, updateGroupUser);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateUserGroup");
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

<a id="updateUserQtyWasted"></a>
# **updateUserQtyWasted**
> UpdateUserQtyWasted200Response updateUserQtyWasted(userId, updateQtyWasted)

Update user&#39;s qtyWasted

Updates the qtyWasted value for a specific user. Only authenticated users can update their own qtyWasted. The request body must contain the new qtyWasted value. Each time this endpoint is called, it will update the user&#39;s qtyWasted accordingly and will be called by Bills microservice.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    UsersApi apiInstance = new UsersApi(defaultClient);
    UUID userId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000"); // UUID | The ID of the user.
    UpdateQtyWasted updateQtyWasted = new UpdateQtyWasted(); // UpdateQtyWasted | 
    try {
      UpdateUserQtyWasted200Response result = apiInstance.updateUserQtyWasted(userId, updateQtyWasted);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#updateUserQtyWasted");
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
| **updateQtyWasted** | [**UpdateQtyWasted**](UpdateQtyWasted.md)|  | |

### Return type

[**UpdateUserQtyWasted200Response**](UpdateUserQtyWasted200Response.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | qtyWasted updated successfully. |  -  |
| **400** | Bad Request. The request parameters are invalid. |  -  |
| **401** | Unauthorized. The request requires user authentication. |  -  |
| **403** | Forbidden. The user does not have the necessary permissions to access this endpoint. |  -  |
| **404** | Not Found. The requested resource could not be found. |  -  |
| **500** | Internal Server Error. An unexpected error occurred on the server. |  -  |

<a id="usersPut"></a>
# **usersPut**
> User usersPut(userId, user)

Update an existing user.

Update an existing user&#39;s information. Only users with appropriate permissions can access this endpoint. The user authentication and authorization are required to access this endpoint. The user authenticated and authorized will be able to update their information.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    UsersApi apiInstance = new UsersApi(defaultClient);
    UUID userId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000"); // UUID | The ID of the user.
    User user = new User(); // User | 
    try {
      User result = apiInstance.usersPut(userId, user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersPut");
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
| **user** | [**User**](User.md)|  | |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User updated successfully. |  -  |
| **401** | Unauthorized. The request requires user authentication. |  -  |
| **403** | Forbidden. The user does not have the necessary permissions to access this endpoint. |  -  |
| **404** | Not Found. The requested resource could not be found. |  -  |
| **503** | Service Unavailable. The server is currently unable to handle the request. |  -  |
| **500** | Internal Server Error. An unexpected error occurred on the server. |  -  |

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
import org.openapitools.client.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8083");

    UsersApi apiInstance = new UsersApi(defaultClient);
    UUID userId = UUID.fromString("123e4567-e89b-12d3-a456-426614174000"); // UUID | The ID of the user.
    try {
      UsersUserIdBudgetGet200Response result = apiInstance.usersUserIdBudgetGet(userId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#usersUserIdBudgetGet");
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

