package com.zhzy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Name: com.zhzy.controller
 * @Description:
 * @Auther: zhzy
 * @Date: 2019-12-2019/12/06 14:17
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/findTest")
    public Object findTestInfoList(){

        return "111111";
    }

}
