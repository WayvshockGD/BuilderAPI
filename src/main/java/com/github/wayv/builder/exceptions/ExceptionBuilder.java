package com.github.wayv.builder.exceptions;

public class ExceptionBuilder {

    public static Exception init(String content) {
        return new Exception(content);
    }
}
