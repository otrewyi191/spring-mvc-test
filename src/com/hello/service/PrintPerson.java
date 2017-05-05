package com.hello.service;

import com.hello.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/5/2 0002.
 */
@Component
public class PrintPerson {
    @Autowired
    private Person p;


    public String toString()
    {
        return p.getName()+":"+p.getAge();
    }

}
