package com.example.mydemo2.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Data
@TableName("t_user")
public class User {

    @TableId(type = IdType.AUTO)
    private int id;

    private String username;
    private String password;

    @DateTimeFormat(pattern = "yyyy-MM-dd") // 加上這一行
    private Date birthday;

//  Select id, username, password, orders from t_user;
    @TableField(exist = false)
    private List<Order> orders;
}
