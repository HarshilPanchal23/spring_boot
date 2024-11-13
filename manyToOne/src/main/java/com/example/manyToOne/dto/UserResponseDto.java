package com.example.manyToOne.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDto {

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private Boolean status;

    private OrganizationResponseDto organizationResponseDto;
}