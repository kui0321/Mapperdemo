package com.wsk.test;

import com.wsk.pojo.Users;
import com.wsk.service.UsersService;
import com.wsk.service.impl.UsersServiceImpl;

public class selectUserByIdTest {
    public static void main(String[] args) {
        UsersService usersService = new UsersServiceImpl();
        Users users = usersService.findUsersById(1);
        System.out.println(users);
    }
}
