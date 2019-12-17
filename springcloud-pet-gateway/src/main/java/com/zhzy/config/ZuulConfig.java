package com.zhzy.config;

import com.zhzy.filter.AuthorizedRequestFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Name: com.zhzy.config
 * @Description:
 * @Auther: zhzy
 * @Date: 2019-12-2019/12/11 15:14
 */
@Configuration
public class ZuulConfig {

    @Bean
    public AuthorizedRequestFilter getAuthorizedRequestFilter() {
        return new AuthorizedRequestFilter() ;
    }
}
