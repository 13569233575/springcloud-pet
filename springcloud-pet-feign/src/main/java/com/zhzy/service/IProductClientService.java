package com.zhzy.service;

import com.zhzy.feign.FeignClientConfig;
import com.zhzy.hystrix.IProductClientServiceFallbackFactory;
import com.zhzy.product.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "springcloud-pet-product",configuration = FeignClientConfig.class,fallbackFactory = IProductClientServiceFallbackFactory.class)
public interface IProductClientService {

    @RequestMapping("/product/get/{id}")
    Product getProduct(@PathVariable("id") long id);

    @RequestMapping("/product/list")
    List<Product> listProduct() ;

    @RequestMapping("/product/add")
    boolean addPorduct(Product product) ;

}