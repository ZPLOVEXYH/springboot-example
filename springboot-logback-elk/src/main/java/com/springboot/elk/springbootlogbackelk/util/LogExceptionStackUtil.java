package com.springboot.elk.springbootlogbackelk.util;

import java.io.PrintWriter;
import java.io.StringWriter;

public class LogExceptionStackUtil {

    /**
     * @param e
     * @功能说明:在日志文件中，打印异常堆栈
     * @return:String
     */
    public static String LogExceptionStack(Throwable e) {
        StringWriter errorsWriter = new StringWriter();
        e.printStackTrace(new PrintWriter(errorsWriter));
        return errorsWriter.toString();
    }
}
