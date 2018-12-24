package com.example.springboot_rabbit_sender.Model;

import java.io.Serializable;

/**
 * @author XuJD
 * @create 2018-11-20 17:11
 **/
public class User implements Serializable{
    private String name;
    private Integer age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
