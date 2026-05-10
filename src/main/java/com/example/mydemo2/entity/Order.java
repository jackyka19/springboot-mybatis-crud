package com.example.mydemo2.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("t_order")
public class Order {
    private int id;

    private Date order_time;
    private int total;
    private int uid;

    @TableField(exist = false)
    private User user;          // ← 加上這個！

}
