package com.hello.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/5/2 0002.
 */
@Component
@Aspect
public class Advices {
    @Pointcut("execution(* com.hello.controller.Hello.*(..))")
    private void anyMethod(){}

    @Before("anyMethod()")
    public void before(JoinPoint jp){
        System.out.println("----------前置通知----------");
        System.out.println("应用注解的类名："+jp.getTarget().getClass().getName());
        System.out.println(jp.getSignature().getName());
        System.out.println(jp.getTarget().getClass().getName());
    }

    @After("anyMethod()")
    public void after(JoinPoint jp){
        System.out.println("----------最终通知----------");
    }

/*    @After("execution(* com.hello.controller.Hello.*(..))")
    public void after(JoinPoint jp){
        System.out.println("----------最终通知----------");
    }*/

/*    @Around("anyMethod()")
    public void around(ProceedingJoinPoint jp) {
        System.out.println(jp.getTarget().getClass().getName());
    }*/
}