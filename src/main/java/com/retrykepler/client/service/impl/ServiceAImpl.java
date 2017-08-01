package com.retrykepler.client.service.impl;

import com.retrykepler.client.service.ServiceA;
import com.retrykepler.client.service.ServiceB;
import com.retrykepler.client.service.ServiceC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zbyte on 17-7-20.
 */
@Component
public class ServiceAImpl implements ServiceA {

    @Autowired
    private ServiceC serviceC;

    public void save(String data) {
        System.out.println("A save ..."+data);
        serviceC.callB(data);
        System.out.println("A commit");
    }
}
