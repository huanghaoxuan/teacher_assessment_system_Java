package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @program: demo
 * @description: 用户实体类
 * @author: zalej
 * @create: 2019-04-17 09:54
 **/
@Table(name = "mydb")
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    @Column(name = "center_id")
    private String userName;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
