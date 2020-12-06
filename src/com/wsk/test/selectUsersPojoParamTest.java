package com.wsk.test;

import com.wsk.mapper.UsersMapper;
import com.wsk.pojo.Users;
import com.wsk.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class selectUsersPojoParamTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        Users users = new Users();
        users.setUsername("LEFT");
        users.setUsersex("nice");
        List<Users> list = usersMapper.selectUsersPojoParam(users);
        list.forEach(System.out::println);
    }
}
