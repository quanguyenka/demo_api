package com.nguyen.apis.dao;

import com.nguyen.apis.entity.User;

import java.util.List;

public interface UserDao {
    User getUserById(Integer id);
    List<User> getAllUser();
    Boolean deleteUserById(Integer id);
    //....
}
