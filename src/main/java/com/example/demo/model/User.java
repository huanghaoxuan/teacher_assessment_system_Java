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
    private String accessName;
    @Column(name = "access_pass")
    private String accessPass;
    @Column(name = "access_identity")
    private String accessIdentity;

    public String getAccessName() {
        return accessName;
    }

    public void setAccessName(String accessName) {
        this.accessName = accessName;
    }

    public String getAccessPass() {
        return accessPass;
    }

    public void setAccessPass(String accessPass) {
        this.accessPass = accessPass;
    }

    public String getAccessIdentity() {
        return accessIdentity;
    }

    public void setAccessIdentity(String accessIdentity) {
        this.accessIdentity = accessIdentity;
    }
}
