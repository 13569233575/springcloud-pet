package com.zhzy.product;

import lombok.Data;

import java.io.Serializable;

/**
 * @Name: com.zhzy.api.vo
 * @Description:
 * @Auther: zhzy
 * @Date: 2019-10-2019/10/29 10:26
 */
@Data
public class Product implements Serializable {

    private Long productId;
    private String productName;
    private String productDesc;
}
