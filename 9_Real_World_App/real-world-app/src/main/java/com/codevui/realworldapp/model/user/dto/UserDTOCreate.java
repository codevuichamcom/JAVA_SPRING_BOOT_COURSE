package com.codevui.realworldapp.model.user.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDTOCreate {
    private String username;
    private String email;
    private String password;
}
