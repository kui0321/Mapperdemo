package com.wsk.test;

import com.wsk.mapper.UsersMapper;
import com.wsk.pojo.Users;
import com.wsk.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class selectUsersMapParamTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        Map<String, String> map = new HashMap<>();
        map.put("keyname","LEFT");
        map.put("keysex","nice");
        List<Users> list = usersMapper.selectUsersMapParam(map);
        list.forEach(System.out::println);
        MyBatisUtils.closeSqlSession();

    }
}
