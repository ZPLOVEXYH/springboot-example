package com.springboot.elk.springbootlogbackelk.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.PrintWriter;
import java.io.StringWriter;

@RestController
@RequestMapping("/elk")
public class ElkController {

    Logger logger = LoggerFactory.getLogger(ElkController.class);

    @GetMapping("log")
    public String log(){
        try {
            String i = "32b";
            logger.debug("--------------debug----------------" + Integer.parseInt(i));
            logger.info(" {\"name\":\"王小二\",\"age\":15,\"address\":{\"province\":\"浙江\",\"city\":\"杭州\",\"district\":\"西湖区\"},\"hobby\":[\"足球\",\"棒球\",\"乒乓球\"]}");
            logger.error("--------------error----------------");
        } catch (Exception e) {
            e.printStackTrace();
            logger.error("出错了" + LogExceptionStack(e));
        }

        return "success";
    }

    /**
     *
     * @功能说明:在日志文件中，打印异常堆栈
     * @param Throwable
     * @return:String
     */
    public static String LogExceptionStack(Throwable e) {
        StringWriter errorsWriter = new StringWriter();
        e.printStackTrace(new PrintWriter(errorsWriter));
        return errorsWriter.toString();
    }
}
