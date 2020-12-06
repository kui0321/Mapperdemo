package com.wsk.service;

import com.wsk.pojo.Users;

import java.util.List;

public interface UsersService {
    List<Users> findUsersAll();
    Users findUsersById(int userid);
}
