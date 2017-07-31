package com.sd.xm003.model;

import org.apache.ibatis.mapping.ParameterMapping;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.JDBCType;

/**
 * Created by KF03 on 2017/7/22.
 */
@Table(name = "user")
public class UserModel implements Serializable {
    private static final long serialVersionUID = 239650871109115265L;
    @Id
    @Column
    @GeneratedValue(generator = "JDBC")
    private  Integer id;
    @Column
    private  String username;
    @Column
    private String password;
    @Column
    private int enable;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEnable() {
        return enable;
    }

    public void setEnable(int enable) {
        this.enable = enable;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", enable='" + enable + '\'' +
                '}';
    }
}
