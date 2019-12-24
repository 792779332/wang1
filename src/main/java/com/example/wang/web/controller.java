package com.example.wang.web;


import com.example.wang.Util.MessageUtil;
import com.example.wang.bean.Message;
import io.swagger.annotations.ApiImplicitParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {



    @GetMapping("/a")
    @ApiImplicitParam(name = "a",value = "不知道",paramType = "query",dataType = "int",required = true)
    public Message list(int a){


        return MessageUtil.success(123);
    }

}
