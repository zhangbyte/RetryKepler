package com.retrykepler.client.service;

import com.kepler.annotation.Service;
import com.retry.annotation.Retryable;

/**
 * Created by zbyte on 17-7-20.
 */
@Service(version = "0.0.1")
public interface ServiceB {

    void save();

    @Retryable
    boolean save(String data);

}
