package com.zhzy.controller;

import com.alibaba.druid.support.json.JSONUtils;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zhzy.controller.common.BaseController;
import com.zhzy.product.Product;
import com.zhzy.service.IProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/prodcut")
public class ProductController extends BaseController {

    @Resource
    private IProductService iProductService;

//    import com.netflix.discovery.DiscoveryClient;
//    import org.springframework.cloud.client.discovery.DiscoveryClient;
    @Resource
    private DiscoveryClient client ; // 进行Eureka的发现服务0

    @RequestMapping(value="/get/{id}")
    public Object get(@PathVariable("id") long id) {
        Product product = this.iProductService.get(id);
        if(product == null){
            throw new RuntimeException("该产品已下架!");
        }
        return product;
    }

    @RequestMapping(value="/add")
    public Object add(@RequestBody Product product) {
        return this.iProductService.add(product) ;
    }
    @RequestMapping(value="/list")
    public Object list() {
        return this.iProductService.list() ;
    }


    @RequestMapping("/discover")
    public Object discover() { // 直接返回发现服务信息
        return this.client ;
    }
}