package com.hello.controller;

import com.hello.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by Administrator on 2017/5/2 0002.
 */
@Controller
@RequestMapping("/person")
public class PersonController {
    //boxing automatically
    @RequestMapping("/zzx")
    public String toPerson(Person p){
        System.out.println(p.getName()+" "+p.getAge());
        return "hello";
    }

    //match automatically
    @RequestMapping("/person")
    public String toPerson(String name,double age){
        System.out.println(name+" "+age);
        return "auto";
    }

    //pass the parameters to front-end
    @RequestMapping("/show")
    public String showPerson(Map<String,Object> map){
        Person p =new Person("abc",123);
        map.put("p", p);
        p.setAge(20);
        p.setName("jayjay");
        return "show";
    }

    //redirect
    @RequestMapping("/redirect")
    public String redirect(){
        return "redirect:zzx";
    }
}
