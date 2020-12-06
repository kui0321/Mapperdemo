package com.wsk.test;

import com.wsk.mapper.UsersMapper;
import com.wsk.pojo.Users;
import com.wsk.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

public class insertUsersTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        Users users = new Users();
        users.setUsername("LOJG");
        users.setUsersex("nv");
        int flag = usersMapper.insertUsers(users);
        sqlSession.commit();
        System.out.println(flag);
        MyBatisUtils.closeSqlSession();
    }
}
