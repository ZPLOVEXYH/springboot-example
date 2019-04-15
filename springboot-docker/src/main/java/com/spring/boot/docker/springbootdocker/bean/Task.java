package com.spring.boot.docker.springbootdocker.bean;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.Future;

@Component
public class Task {

    public static Random random = new Random();

    @Async
    public Future<String> doTaskOne() {
        try {
            System.out.println("开始做任务一");
            long start = System.currentTimeMillis();
            Thread.sleep(random.nextInt(10000));
            long end = System.currentTimeMillis();
            System.out.println("完成任务一，耗时：" + (end - start) + "毫秒");
            String s = "34d";
            int a = Integer.parseInt(s);
            System.out.println("转换" + a);

            return new AsyncResult<>("任务一执行完毕");
        } catch (Exception e) {
            return new AsyncResult<>("任务执行异常");
        }
    }
}
