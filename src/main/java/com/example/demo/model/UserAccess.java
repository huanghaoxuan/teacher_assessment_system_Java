package com.example.demo.model;

import java.io.Serializable;

public class UserAccess implements Serializable {
    private Integer id;

    private String access_name;

    private String access_pass;

    private Integer access_identity;

    private static final long serialVersionUID = 1L;

    public UserAccess() {
    }

    public UserAccess(String access_name, String access_pass) {
        this.access_name = access_name;
        this.access_pass = access_pass;
    }

    public UserAccess(String access_name, String access_pass, Integer access_identity) {
        this.access_name = access_name;
        this.access_pass = access_pass;
        this.access_identity = access_identity;
    }

    public UserAccess(Integer id, String access_name, String access_pass, Integer access_identity) {
        this.id = id;
        this.access_name = access_name;
        this.access_pass = access_pass;
        this.access_identity = access_identity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccess_name() {
        return access_name;
    }

    public void setAccess_name(String access_name) {
        this.access_name = access_name == null ? null : access_name.trim();
    }

    public String getAccess_pass() {
        return access_pass;
    }

    public void setAccess_pass(String access_pass) {
        this.access_pass = access_pass == null ? null : access_pass.trim();
    }

    public Integer getAccess_identity() {
        return access_identity;
    }

    public void setAccess_identity(Integer access_identity) {
        this.access_identity = access_identity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", access_name=").append(access_name);
        sb.append(", access_pass=").append(access_pass);
        sb.append(", access_identity=").append(access_identity);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}