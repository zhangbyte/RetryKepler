package com.retrykepler.client.service.impl;

import com.retry.annotation.Retryable;
import com.retrykepler.client.service.ServiceC;
import com.retrykepler.service.ServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by zbyte on 17-8-2.
 */
@Component
public class ServiceCImpl implements ServiceC {

    @Autowired
    private ServiceB serviceB;

    @Retryable
    public void callB(String data) {
        serviceB.save(data);
    }

}
