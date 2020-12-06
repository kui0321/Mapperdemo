package com.wsk.mapper;

import com.wsk.pojo.Users;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface UsersMapper {
    List<Users> selectUsersAll();
    Users selectUsersById(int userid);
    List<Users> selectUsersOrderParam(String username, String usersex);
    List<Users> selectUsersAnnParam(@Param("name") String username,@Param("sex") String usersex);
    List<Users> selectUsersPojoParam(Users users);
    List<Users> selectUsersMapParam(Map<String, String> map);
    List<Users> selectUsersRowBound(RowBounds rowBounds);
    List<Users> selectUsersLimit(@Param("offset") int offset, @Param("limit") int limit);
    int insertUsers(Users users);
    void insertUsersGetKey(Users users);
    void insertUsersGetByKey(Users users);
    List<Users> selectUsersByProperty(Users users);
    List<Users> selectUsersByChose(Users users);
    List<Users> selectUsersByLikeName(String name);
    void usersUpdate(Users users);
    List<Users> selectUsersByIdUseCollection(Collection collection);
    List<Users> selectUsersByIdUseArray(int[] array);
    int selectUsersCount(@Param("userid") Map<String, String> map);
    int insertUsersBatch(List<Users> list);
}
