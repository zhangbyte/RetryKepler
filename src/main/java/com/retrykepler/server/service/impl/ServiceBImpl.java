package com.retrykepler.server.service.impl;

import com.kepler.annotation.Autowired;
import com.retrykepler.client.service.ServiceB;

/**
 * Created by zbyte on 17-7-20.
 */
@Autowired
public class ServiceBImpl implements ServiceB {

    public boolean save(String data) {
        System.out.println("B save ..."+data);
        System.out.println("B commit");
        return true;
    }
}
