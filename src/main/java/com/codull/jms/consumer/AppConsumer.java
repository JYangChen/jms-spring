package com.codull.jms.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: jms-spring
 * @description: 消费者启动类
 * @author: anthony1314
 * @create: 2020-02-09 01:56
 **/

public class AppConsumer {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        
    }
}
