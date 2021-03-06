package com.wsk.test;

import com.wsk.mapper.UsersMapper;
import com.wsk.pojo.Users;
import com.wsk.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

public class insertUsersGetKeyTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        Users users = new Users();
        users.setUsername("limin");
        users.setUsersex("nan");
        usersMapper.insertUsersGetKey(users);
        sqlSession.commit();
        System.out.println(users.getUserid());
        MyBatisUtils.closeSqlSession();
    }
}
