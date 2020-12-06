package com.wsk.test;

import com.wsk.mapper.UsersMapper;
import com.wsk.pojo.Users;
import com.wsk.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class selectUsersByLikeNameTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        List<Users> list = usersMapper.selectUsersByLikeName("L");
        list.forEach(System.out::println);
    }
}
