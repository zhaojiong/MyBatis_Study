/**
 * User.java
 * Created at 2017年8月11日
 * Created by zhaojiong
 * Copyright (C) 2017 SHANGHAI VOLKSWAGEN, All rights reserved.
 */
package com.mybatis;

/**
 * <p>ClassName: User</p>
 * <p>Description: TODO</p>
 * <p>Author: zhaojiong</p>
 * <p>Date: 2017年8月11日</p>
 */
public class User {

    //实体类的属性和表的字段名称一一对应
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}
