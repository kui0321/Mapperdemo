package com.wsk.test;

import com.wsk.mapper.UsersMapper;
import com.wsk.pojo.Users;
import com.wsk.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

public class selectUsersByIdCacheTwoTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        Users users = usersMapper.selectUsersById(1);
        System.out.println(users);
        MyBatisUtils.closeSqlSession();
        System.out.println("-------------------------");
        SqlSession sqlSession1 = MyBatisUtils.getSqlSession();
        UsersMapper usersMapper1 = sqlSession1.getMapper(UsersMapper.class);
        Users users1 = usersMapper1.selectUsersById(1);
        System.out.println(users1);
    }
}
