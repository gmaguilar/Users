package org.openapitools.api;

import org.openapitools.model.CreateUserRequest;
import org.openapitools.model.Error;
import org.openapitools.model.LoginRequest;
import org.openapitools.model.LoginResponse;
import org.openapitools.model.LogoutResponse;
import org.openapitools.model.Success;
import java.util.UUID;
import org.openapitools.model.UpdateGroupUser;
import org.openapitools.model.UpdateQtyWasted;
import org.openapitools.model.UpdateUserGroup200Response;
import org.openapitools.model.UpdateUserPassword200Response;
import org.openapitools.model.UpdateUserPasswordRequest;
import org.openapitools.model.UpdateUserQtyWasted200Response;
import org.openapitools.model.User;
import org.openapitools.model.UsersUserIdBudgetGet200Response;
import org.openapitools.model.UsersUserIdBudgetPutRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.context.request.NativeWebRequest;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-12T21:07:14.295530+01:00[Europe/Madrid]", comments = "Generator version: 7.26.0")
@Controller
@RequestMapping("${openapi.users.base-path:}")
public class UsersApiController implements UsersApi {

    private final NativeWebRequest request;

    @Autowired
    public UsersApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
