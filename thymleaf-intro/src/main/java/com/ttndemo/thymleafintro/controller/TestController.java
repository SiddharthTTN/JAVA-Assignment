package com.ttndemo.thymleafintro.controller;

import com.ttndemo.thymleafintro.enums.AdminType;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
public class TestController {
    @RequestMapping("/hello")
    @ResponseBody
    public String printHello() {
        return "Helloooooo";
    }

    @RequestMapping("/helloTom")
    public String printHelloTom(Model model) {
        model.addAttribute("name", "Tom");
        return "Hello";
    }

    @RequestMapping(value = "/sayHelloForm", method = RequestMethod.GET)
    public String formView() {
        return "sayHelloForm";
    }

    @RequestMapping(value = "/sayHelloForm", method = RequestMethod.POST)
    public String formSubmit(HttpServletRequest httpRequest, Model model) {
        model.addAttribute("name", httpRequest.getParameter("name"));
        return "hello1";
    }

///////////////////////////////////////////////////////////////////////////////////////////////////

    @GetMapping("/Ques1")
    public String ques1() {
        return "Question1";
    }

    @GetMapping("/Ques2")
    public String ques2() {
        return "Question2";
    }

    @GetMapping("/Ques3")
    public String ques3() {
        return "Question3";
    }

    @PostMapping("/Ques3")
    public String ques3(Model model, HttpServletRequest httpServletRequest) {
        String name = httpServletRequest.getParameter("name");
        Integer age = Integer.valueOf(httpServletRequest.getParameter("age"));
        model.addAttribute(name);
        model.addAttribute(age);
        System.out.println("User with name " + name + " and age " + age + " registered !!");
        return "Question3";
    }

    @GetMapping("/Ques4")
    public String ques4() {
        return "Question3";
    }

    @PostMapping("/Ques4")
    public String ques4(Model model, HttpServletRequest httpServletRequest) {
        String name = httpServletRequest.getParameter("name");
        Integer age = Integer.valueOf(httpServletRequest.getParameter("age"));
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        return "Question4";
    }

    @GetMapping("/Ques5")
    public String ques5() {
        return "Question5";
    }

    @PostMapping("/Ques5")
    public String ques5(Model model, HttpServletRequest httpServletRequest) {
        String name = httpServletRequest.getParameter("name");
        Integer age = Integer.valueOf(httpServletRequest.getParameter("age"));
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("isAdmin",httpServletRequest.getParameter("isAdmin"));
        return "Ques5Result";
    }

    @GetMapping("/Ques7")
    public String ques7() {
        return "Question7";
    }

    @GetMapping("/getTime")
    @ResponseBody
    public String getTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        return simpleDateFormat.format(new Date());
    }


    @GetMapping("/Ques8")
    public String ques8(Model model) {
        List<String> employee = Arrays.asList("Siddharth","Gaurav","Vishakha", "Yatin", "Mehak");
        model.addAttribute("employees",employee);
        return "Question8";
    }

    @GetMapping("/Ques9")
    public String ques9() {
        return "Question9";
    }

    @GetMapping("/Ques10")
    public String ques10() {
        return "Question10";
    }

    @PostMapping("/Ques10")
    @ResponseBody
    public String ques10(Model model) {
        return "Your Form has been submitted !!";
    }

}
