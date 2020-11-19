package com.okra.seckill.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnowFlakeTest {

    @Test
    void SnowFlakeGenerate() {
        SnowFlake snowFlake = new SnowFlake(1, 1);
        for (int i=0; i<100; i++) {
            System.out.println(snowFlake.nextId());
        }
    }

}