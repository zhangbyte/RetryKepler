package com.retrykepler.server.service.impl;

import com.kepler.annotation.Autowired;
import com.retrykepler.service.ServiceB2;
import org.springframework.stereotype.Component;

/**
 * Created by zbyte on 17-8-4.
 */
@Autowired
@Component
public class ServiceB2Impl implements ServiceB2 {

    public void save(String data) {
        System.out.println("ServiceB2 save ..." + data);
    }
}
