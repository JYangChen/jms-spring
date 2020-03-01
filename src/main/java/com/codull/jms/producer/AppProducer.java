package com.codull.jms.producer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: jms-spring
 * @description: 生产者启动
 * @author: anthony1314
 * @create: 2020-02-05 13:49
 **/

public class AppProducer {
    public static void main(String [] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("producer.xml");
        ProducerService service = context.getBean(ProducerService.class);
        System.out.println("qaq");
        for(int i = 0; i < 100; i++){
            service.sendMessage("test" + i);
        }
        context.close();
    }
}
