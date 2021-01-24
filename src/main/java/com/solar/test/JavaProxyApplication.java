package com.solar.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaProxyApplication {

    public static void main(String[] args) {
        System.out.println("start proxy server");
        int port = 9999;
        if (args.length > 0) {
            port = Integer.valueOf(args[0]);
        }
        new HttpProxyServer().start(port);

        SpringApplication.run(JavaProxyApplication.class, args);
    }

}
