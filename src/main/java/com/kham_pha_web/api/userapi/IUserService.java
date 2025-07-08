package com.kham_pha_web.api.userapi;

import java.util.List;

public interface IUserService {


    UserDtoResponse createUser(UserDtoRequest userDtoRequest);

    List<UserDtoResponse> getAllUsers();

    UserDtoResponse getUserById(Long id);

    UserDtoResponse updateUser(Long id, UserDtoRequest user);

    UserDtoResponse deleteUser(Long id);

    void deleteAllUsers();

}