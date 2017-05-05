package com.hello.model;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/5/2 0002.
 */


public class Person {
    private String name="zzx";

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

    private int age=27;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
