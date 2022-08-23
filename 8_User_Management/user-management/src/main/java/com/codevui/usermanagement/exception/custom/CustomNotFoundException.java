package com.codevui.usermanagement.exception.custom;

import com.codevui.usermanagement.model.CustomError;

public class CustomNotFoundException extends BaseException {

    public CustomNotFoundException(CustomError customError) {
        super(customError);
    }

}
