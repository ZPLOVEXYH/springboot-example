package com.spring.boot.docker.springbootdocker.controller;

import com.spring.boot.docker.springbootdocker.bean.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

@RestController
public class AsyncController {

    @Autowired
    Task task;

    @GetMapping("/test")
    public void sayHi() throws Exception {
        System.out.println("start syaHi()");
        Future<String> future = task.doTaskOne();
        System.out.println("future:" + future.get());
        System.out.println("future");
        System.out.println("end syaHi()");
    }
}
