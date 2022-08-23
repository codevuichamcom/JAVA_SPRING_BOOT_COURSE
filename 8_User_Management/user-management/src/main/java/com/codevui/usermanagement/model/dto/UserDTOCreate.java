package com.codevui.usermanagement.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDTOCreate {
    private String email;
    private String password;
    private String phone;
    private int age;
}
