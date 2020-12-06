package com.wsk.test;

import com.wsk.mapper.UsersMapper;
import com.wsk.pojo.Users;
import com.wsk.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.sql.Connection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class selectUsersByIdUseCollectionTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        Set<Integer> set = new HashSet<>();
        set.add(6);
        set.add(2);
        List<Users> users = usersMapper.selectUsersByIdUseCollection(set);
        users.forEach(System.out::println);
    }
}
