package com.zjw.provider.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhoum on 2019-07-29.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "classpath:dubbo/*.xml");
        ProviderService providerService = applicationContext.getBean(ProviderService.class);
        System.out.println("是什么：" + providerService.add(1, 3));
    }
}
