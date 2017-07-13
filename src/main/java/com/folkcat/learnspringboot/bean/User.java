package com.folkcat.learnspringboot.bean;

import java.io.Serializable;

/**
 * Created by Tamas on 2017/6/27.
 */

public class User implements Serializable {

    private static final long serialVersionUID = -1L;

    private Long id;
    private String name;
    private Integer age;

    public User(){
        //Do Nothing
    }
    public User(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
}
