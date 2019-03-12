package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.io.IOException;

@Aspect
public class Logging {

    //for Services we need to specify the path @Before("execution(* com.services.*())")
    @Before("execution(* *())")
    void beforeEveryMethod() {
        System.out.println("Before the Method is invoked");
    }

    @After("execution(* *())")
    void afterEveryMethod() {
        System.out.println("After the Method is invoked");
    }

    @AfterThrowing(pointcut = "execution(* *())", throwing = "e")
    void afterReturningAdvice(IOException e) {
        System.out.println("Running AfterThrowing IOException" + e);
    }

    @Before("within(com.*)")
    void beforeAdviceWithin() {
        System.out.println("Running advice with 'within'");
    }

    @Before("bean(database))")
    void beforeAdviceBean() {
        System.out.println("Running when bean of Database is created");
    }

    @Before("args(String)")
    void beforeAdviceArguments() {
        System.out.println("Logged when an Integer as a String is passed in any method");
    }

    @Before("this(com.DummyClass)")
    void beforeAdviceDummy() {
        System.out.println("Invoked when an any bean of Dummy class is created");
    }

    @Pointcut("execution(void connect())")
    void displayPointCut(){};

    @Before("displayPointCut()")
    void beforeAdvicePointcutReuse(){
        System.out.println("This is invoked by reusing a Pointcut by using @Pointcut annotation");
    }

    @Before("execution(void setPort(int))")
    void beforeAdvicePrintingDetails(JoinPoint joinPoint) {
        System.out.println("Will Be Printing the Details of the JointPoint which is the setter of the Port variable in Database class");
        System.out.println(joinPoint);
        System.out.println(joinPoint.getThis());
        System.out.println(joinPoint.getSignature());
        Object [] objects=joinPoint.getArgs();
        for (Object object:objects){
            System.out.println(object);
        }
    }

}
