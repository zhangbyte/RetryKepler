package com.retrykepler.client.service.impl;

import com.retrykepler.client.service.ServiceA;
import com.retrykepler.client.service.ServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zbyte on 17-7-20.
 */
@Component
public class ServiceAImpl implements ServiceA {

    @Autowired
    private ServiceB serviceB;

    public void save(String data) {
        System.out.println("A save ..."+data);
        serviceB.save(data);
        System.out.println("A commit");
    }
}
