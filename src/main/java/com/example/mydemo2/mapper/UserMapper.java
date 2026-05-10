package com.example.mydemo2.mapper;

import com.example.mydemo2.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
//  查詢所有用戶
    @Select("SELECT * FROM user")
    public List<User> find();

    @Insert("INSERT into user values(#{id},#{username},#{password},#{birthday})")
    public int insert(User user);
}
