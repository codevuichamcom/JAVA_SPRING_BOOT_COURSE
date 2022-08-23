package com.codevui.usermanagement.model.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
// Dung de tra ve cho nguoi dung
public class UserDTO {
    private int id;
    private String email;
    private String phone;
    private int age;
}
