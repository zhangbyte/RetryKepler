package com.retrykepler.client;

import com.retrykepler.client.service.ServiceA;
import com.retrykepler.service.ServiceB;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Created by zbyte on 17-8-2.
 */
public class Client {
    public static void main(String[] args) {
        System.setProperty("spring.profiles.active", "prod");
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("kepler-client.xml");
        ServiceA a = context.getBean(ServiceA.class);
        a.callB("didi");
        ServiceB b = context.getBean(ServiceB.class);
        b.save();
        a.callB("didi2");
        b.save();
    }
}
