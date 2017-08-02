package com.retrykepler.service;

import com.kepler.annotation.Service;
import com.retry.annotation.Retryable;

/**
 * Created by zbyte on 17-8-2.
 */
@Service(version = "0.0.1")
public interface ServiceB {

    void save();

    @Retryable
    void save(String data);
}
