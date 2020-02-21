package com.nguyen.apis.service;

import com.nguyen.apis.entity.User;

import java.util.List;

public interface AppService {
    User getUserById(Integer id);

    List<User> getAllUser();

    Boolean deleteUserById(Integer id);
}
