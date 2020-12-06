package com.wsk.test;

import com.wsk.mapper.UsersMapper;
import com.wsk.pojo.Users;
import com.wsk.utils.MyBatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class selectUsersRowBoundTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        RowBounds rowBounds = new RowBounds(0,4);
        List<Users> list = usersMapper.selectUsersRowBound(rowBounds);
        list.forEach(System.out::println);
        MyBatisUtils.closeSqlSession();
    }
}
