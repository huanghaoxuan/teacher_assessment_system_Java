package com.example.demo.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @program: demo
 * @description: 用户实体类
 * @author: zalej
 * @create: 2019-04-17 09:54
 **/
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String gonghao;
    @Column(name = "inkey")
    private String inkey;

    public String getGonghao() {
        return gonghao;
    }

    public void setGonghao(String gonghao) {
        this.gonghao = gonghao;
    }

    public String getInkey() {
        return inkey;
    }

    public void setInkey(String inkey) {
        this.inkey = inkey;
    }
}
