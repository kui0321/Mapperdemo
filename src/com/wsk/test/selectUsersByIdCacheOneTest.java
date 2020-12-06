package com.wsk.test;

import com.wsk.mapper.UsersMapper;
import com.wsk.pojo.Users;
import com.wsk.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;

/**
 * 测试一级缓存
 * mybatis会自动开启缓存
 */
public class selectUsersByIdCacheOneTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UsersMapper usersMapper = sqlSession.getMapper(UsersMapper.class);
        Users users = usersMapper.selectUsersById(1);
        System.out.println(users);
        Users users1 = new Users();
        users1.setUsername("bbbb");
        users1.setUsersex("nan");
        usersMapper.insertUsers(users1);
        System.out.println(users1);
        System.out.println("---------------------------");
        Users users2 = usersMapper.selectUsersById(1);
        System.out.println(users2);
    }
}
