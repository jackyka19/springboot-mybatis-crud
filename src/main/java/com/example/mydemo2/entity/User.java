package com.example.mydemo2.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class User {

    @TableId(type = IdType.AUTO)
    private int id;

    private String username;
    private String password;

    @DateTimeFormat(pattern = "yyyy-MM-dd") // 加上這一行
    private Date birthday;
}
