package com.wsk.test;

import com.wsk.mapper.UsersMapper;
import com.wsk.pojo.Users;
import com.wsk.utils.MyBatisUtils;
import ognl.security.UserMethod;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class insertUsersBatchTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        List<Users> list = new ArrayList<>();
        Users users = new Users();
        users.setUsername("str3");
        users.setUsersex("male");
        Users users1 = new Users();
        users1.setUsername("str4");
        users1.setUsersex("mals");
        list.add(users);
        list.add(users1);
        int flag = usersMapper.insertUsersBatch(list);
        sqlSession.commit();
        System.out.println(flag);
        MyBatisUtils.closeSqlSession();
    }
}
