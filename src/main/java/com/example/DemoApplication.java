package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.alibaba.nacos.NacosDiscoveryProperties;
import org.springframework.cloud.alibaba.nacos.discovery.NacosDiscoveryClient;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;


/**
 * @author daFa
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DemoApplication {


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    /**
     * 解决DiscoveryClientDecorator不被注入的问题
     *
     * @param discoveryProperties
     * @return
     */
//    @Bean("ossNacosDiscoveryClient")
//    public DiscoveryClient nacosDiscoveryClient(
//            NacosDiscoveryProperties discoveryProperties) {
//        return new NacosDiscoveryClient(discoveryProperties);
//    }

}

