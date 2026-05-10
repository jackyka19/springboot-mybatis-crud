package com.example.mydemo2.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.mydemo2.entity.Order;
import com.example.mydemo2.entity.User;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface OrderMapper extends BaseMapper<Order> {

    @Select("Select * FROM t_order where uid = #{uid}")
    List<Order> selectByUid(int uid);

    @Select("select * from t_order")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "order_time", property = "order_time"),
            @Result(column = "total", property = "total"),
            @Result(column = "uid", property = "user", javaType = User.class,
            one = @One(select = "com.example.mydemo2.mapper.UserMapper.selectById")

            )
    })
    List<Order> selectAllOrderAndUser();
}
