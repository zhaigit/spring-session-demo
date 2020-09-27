package com.offcn.session.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @author ：yz
 * @date ：Created in 2020/9/27 9:30
 * @version: 1.0
 */
@RestController
public class TestController {


    /**
     * 向session中设置值
     * @return
     */
    @GetMapping("/setValue")
    public String setValue(HttpSession session){

        session.setAttribute("msg","欢迎你到西安做客");


        return "OK";
    }


    /**
     * 从session中获取值
     * @return
     */
    @GetMapping("/getValue")
    public String getValue(HttpSession session){

        String msg = (String) session.getAttribute("msg");


        return "您获取的数据是："+ msg;

    }


}
