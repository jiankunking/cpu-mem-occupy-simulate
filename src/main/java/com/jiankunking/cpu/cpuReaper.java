package com.jiankunking.cpu;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by jiankunking on 2018/3/29.
 */
@Component
public class cpuReaper {
    @PostConstruct
    public void cpuReaper() {
        int num = 0;
        long start = System.currentTimeMillis() / 1000;
        while (true) {
            num = num + 1;
            if (num == Integer.MAX_VALUE) {
                System.out.println("reset");
                num = 0;
            }
            if ((System.currentTimeMillis() / 1000) - start > 1000) {
                return;
            }
        }
    }
}
