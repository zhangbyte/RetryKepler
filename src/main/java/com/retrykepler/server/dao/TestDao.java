package com.retrykepler.server.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

/**
 * Created by zbyte on 17-7-24.
 */
public interface TestDao {

    @Insert("insert into data values(#{data})")
    int insert(@Param("data") String data);
}
