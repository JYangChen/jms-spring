package com.codull.jms.producer;

/**
 * @program: jms-spring
 * @description: 生产者接口
 * @author: anthony1314
 * @create: 2020-02-04 22:18
 **/
public interface ProducerService {
    void sendMessage(String message);
}
