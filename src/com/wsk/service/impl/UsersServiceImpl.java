package com.wsk.service.impl;

import com.wsk.utils.MyBatisUtils;
import com.wsk.mapper.UsersMapper;
import com.wsk.pojo.Users;
import com.wsk.service.UsersService;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class UsersServiceImpl implements UsersService {

    @Override
    public List<Users> findUsersAll() {
        List<Users> list = null;
        try{
            SqlSession sqlSession = MyBatisUtils.getSqlSession();
            UsersMapper mapper = sqlSession.getMapper(UsersMapper.class);
            list = mapper.selectUsersAll();
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            MyBatisUtils.closeSqlSession();
        }
        return list;
    }

    @Override
    public Users findUsersById(int userid) {
        Users users = null;
        try{
            SqlSession sqlSession = MyBatisUtils.getSqlSession();
            UsersMapper mapper = sqlSession.getMapper(UsersMapper.class);
            users = mapper.selectUsersById(userid);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            MyBatisUtils.closeSqlSession();
        }
        return users;
    }
}
