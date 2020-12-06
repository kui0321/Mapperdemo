package com.wsk.test;

import com.wsk.pojo.Users;
import com.wsk.service.UsersService;
import com.wsk.service.impl.UsersServiceImpl;

import java.util.List;

public class SelectUsersAllTest {
    public static void main(String[] args) {
        UsersService service = new UsersServiceImpl();
        List<Users> list = service.findUsersAll();
        list.forEach(System.out::println);
    }
}
