package com.retrykepler.client;

import com.retrykepler.client.service.ServiceA;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zbyte on 17-7-20.
 */
public class ClientStart {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("kepler-client.xml");
        ServiceA a = context.getBean(ServiceA.class);
        a.save("didi");
    }
}
