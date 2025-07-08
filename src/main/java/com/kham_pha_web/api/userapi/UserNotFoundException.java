package com.kham_pha_web.api.userapi;

import com.kham_pha_web.exception.EntityNotFoundException;

public class UserNotFoundException extends EntityNotFoundException {
    public UserNotFoundException(Long id) {
        super("User", id);
    }
}