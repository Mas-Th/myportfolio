package com.kham_pha_web.exception;

// Không có annotation @ResponseStatus ở đây
public class ForbiddenException extends RuntimeException {
    public ForbiddenException(String message) {
        super(message);
    }
}