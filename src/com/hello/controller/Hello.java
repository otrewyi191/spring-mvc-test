package com.hello.controller;

import com.hello.model.Person;
import com.hello.service.PrintPerson;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/5/2 0002.
 */


@Controller
@RequestMapping("/mvc")
public class Hello {
    private static Logger logger = Logger.getLogger(Hello.class);

/*    @RequestMapping("/hello")
    public String index() {
        System.out.println("hello");
        return "hello";
    }*/

    @Autowired
    private PrintPerson printPerson;

    @RequestMapping("/hello")
    public String index() {
        System.out.println(printPerson);
        logger.error(printPerson);

        return "hello";
    }

    @RequestMapping("/h1")
    public String test2() {
        System.out.println("h1");
        logger.error("h1");
        return "hello";
    }


}

