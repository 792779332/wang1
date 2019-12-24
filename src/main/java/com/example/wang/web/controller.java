package com.example.wang.web;


import com.example.wang.Util.MessageUtil;
import com.example.wang.bean.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {



    @GetMapping("/a")
    public Message list(){


        return MessageUtil.success(123);
    }

}
