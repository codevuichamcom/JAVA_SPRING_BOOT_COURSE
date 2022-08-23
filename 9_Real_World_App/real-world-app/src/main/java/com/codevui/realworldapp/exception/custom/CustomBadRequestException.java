package com.codevui.realworldapp.exception.custom;

import com.codevui.realworldapp.model.CustomError;

public class CustomBadRequestException extends BaseCustomException {

    public CustomBadRequestException(CustomError customError) {
        super(customError);
    }

}
