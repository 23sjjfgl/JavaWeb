package com.lanqiao.mapper;

import com.lanqiao.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {


    @Select("select * from users where user_name = #{username} and user_password = #{password}")
    @ResultMap("brandResultMap")
    User UserSelect(@Param("username") String username, @Param("password") String password);

}
