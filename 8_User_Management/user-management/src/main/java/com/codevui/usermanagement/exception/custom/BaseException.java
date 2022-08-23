package com.codevui.usermanagement.exception.custom;

import java.util.HashMap;
import java.util.Map;

import com.codevui.usermanagement.model.CustomError;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class BaseException extends Exception {
    Map<String, CustomError> errors;

    public BaseException(CustomError customError) {
        this.errors = new HashMap<String, CustomError>();
        this.errors.put("error", customError);
    }

}
