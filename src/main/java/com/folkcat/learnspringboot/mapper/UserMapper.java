package com.folkcat.learnspringboot.mapper;

import com.folkcat.learnspringboot.bean.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Tamas on 2017/6/28.
 */
@Mapper
public interface UserMapper {
    @Select("SELECT * FROM USER WHERE NAME = #{name}")
    User findByName(@Param("name") String name);

    @Insert("INSERT INTO USER(NAME, AGE) VALUES(#{name}, #{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);

    @Delete("DELETE FROM USER WHERE NAME=#{name}")
    int deleteByName(String name);

    @Update("UPDATE USER SET NAME=#{name},AGE=#{age} WHERE id=#{id}")
    int update(User user);

    @Update("UPDATE USER SET NAME=#{name},AGE=#{age} WHERE id=#{id}")
    int updateByMap(Map map);

    @Select("SELECT id,name,age FROM USER")
    List<User> getAll();

    @Insert("INSERT INTO USER values user")
    int insertWithoutColumn(User user);
}