package com.retrykepler.server;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by zbyte on 17-8-2.
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("kepler-service.xml");
        context.start();
        System.in.read();
        context.close();
    }
}
