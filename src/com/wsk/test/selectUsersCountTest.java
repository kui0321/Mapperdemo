package com.wsk.test;

import com.wsk.mapper.UsersMapper;
import com.wsk.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.HashMap;
import java.util.Map;

public class selectUsersCountTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        Map<String, String> map = new HashMap<>();
        map.put("username","oldlu");
        map.put("usersex","male");
        int count = usersMapper.selectUsersCount(map);
        System.out.println(count);
    }
}
