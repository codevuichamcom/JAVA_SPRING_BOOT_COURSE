package com.codevui.usermanagement.exception.custom;

import com.codevui.usermanagement.model.CustomError;

public class CustomBadRequestException extends BaseException {

    public CustomBadRequestException(CustomError customError) {
        super(customError);
    }

}
