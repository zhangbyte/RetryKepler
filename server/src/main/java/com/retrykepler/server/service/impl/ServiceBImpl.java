package com.retrykepler.server.service.impl;

import com.kepler.annotation.Autowired;
import com.retrykepler.service.ServiceB;
import org.springframework.stereotype.Component;

/**
 * Created by zbyte on 17-8-2.
 */
@Autowired
@Component
public class ServiceBImpl implements ServiceB {

    public void save() {
        System.out.println("This is general function");
    }

    public void save(String data) {
        System.out.println("This is retry function");
    }
}
