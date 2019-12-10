package com.zhzy.controller;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;

/**
 * @Name: com.zhzy.controller
 * @Description:
 * @Auther: zhzy
 * @Date: 2019-12-2019/12/09 14:58
 */
public class UserController extends HystrixCommand<Object> {
    protected UserController(HystrixCommandGroupKey group) {
        super(group);
    }

    @Override
    protected Object run() throws Exception {
        return null;
    }
}
