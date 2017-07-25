package com.retrykepler.server.service.impl;

import com.kepler.annotation.Autowired;
import com.retrykepler.client.service.ServiceB;
import com.retrykepler.server.dao.TestDao;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zbyte on 17-7-20.
 */
@Autowired
public class ServiceBImpl implements ServiceB {

    @org.springframework.beans.factory.annotation.Autowired
    private TestDao testDao;

    public void save() {
    }

    @Transactional
    public boolean save(String data) {
        testDao.insert(data);
        System.out.println("B save ..."+data);
        System.out.println("B commit");
//        throw new RuntimeException("B 保存失败");
        return true;
    }
}
