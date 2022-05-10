package com.example.test1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author: yjx
 * Date :2022/5/1012:07
 **/
@RestController
@RequestMapping("/hello")
public class TestController {
  @GetMapping("")
  public  String hello(){
    System.out.println("hello world");
    return "success";
  }
}
