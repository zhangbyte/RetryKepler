package com.retrykepler.client.service.impl;

import com.retrykepler.client.service.ServiceA;
import com.retrykepler.client.service.ServiceC;
import com.retrykepler.service.ServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zbyte on 17-8-2.
 */
@Component
public class ServiceAImpl implements ServiceA{

    @Autowired
    private ServiceB serviceB;
    @Autowired
    private ServiceC serviceC;

    public void callB(String data) {
        System.out.println("A do sth...");
//        serviceB.save(data);
        serviceC.callB(data);
    }
}
