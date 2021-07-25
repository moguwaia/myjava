package com.imooc.passbook.merchants;

import com.imooc.passbook.merchants.security.AuthCheckIntercepter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.annotation.Resource;

/**
 * @author Administrator
 */
@SpringBootApplication
public class MerchantsApplication extends WebMvcConfigurerAdapter {
    
    @Resource
    private AuthCheckIntercepter authCheckIntercepter;
    
    public static void main(String[] args) {
        SpringApplication.run(MerchantsApplication.class, args);
    }
    
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        
        registry.addInterceptor(authCheckIntercepter)
                .addPathPatterns("/merchants/**");
        super.addInterceptors(registry);
    }
}
