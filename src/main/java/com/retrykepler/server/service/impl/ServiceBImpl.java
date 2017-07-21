package com.retrykepler.server.service.impl;

import com.kepler.annotation.Autowired;
import com.retry.annotation.Retryable;
import com.retrykepler.client.service.ServiceB;

import java.util.UUID;

/**
 * Created by zbyte on 17-7-20.
 */
@Autowired
public class ServiceBImpl implements ServiceB {
    @Retryable
    public boolean save(String data) {
        System.out.println("B save ..."+data);
        System.out.println("B commit");
        return true;
    }
}
