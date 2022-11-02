package com.school.ecommerceupch.controllers.dtos.requests;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Email;
import java.util.Date;

@Getter @Setter
public class CreateUserRequest {
    @Email
    private String email;

    @NotBlank @NotNull
    private String firstName;

    @NotBlank @NotNull
    private String lastName;

    @NotBlank @NotNull
    private String password;

    @NotNull
    private Date dateOfBirth;
}
