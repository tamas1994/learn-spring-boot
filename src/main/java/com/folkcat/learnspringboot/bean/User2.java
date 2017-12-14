package com.folkcat.learnspringboot.bean;

import javax.persistence.*;

/**
 * Created by Tamas on 2017/6/27.
 */
//@Entity
//@Table(name="user2")
public class User2 {
    //@Id
    //@GeneratedValue
    private Long id;
    //@Column(nullable = false)
    private String name;
    //@Column(nullable = false)
    private Integer age;

    public User2(){

    }

    public User2(String name,int age){
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
