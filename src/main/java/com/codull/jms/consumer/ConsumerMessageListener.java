package com.codull.jms.consumer;

import javax.jms.*;

/**
 * @program: jms-spring
 * @description: 消费者消息监听者
 * @author: anthony1314
 * @create: 2020-02-09 01:50
 **/

public class ConsumerMessageListener  implements MessageListener {
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage) message;
        try{
            System.out.println("接收消息" + textMessage.getText());
        }catch (JMSException E){
            E.printStackTrace();
        }
    }
}
