package com.w77996.demo.dao;

import com.w77996.demo.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserDao {

    @Select("select * from tb_user where id")
    public User getUserById(@Param("id")int id);
}
