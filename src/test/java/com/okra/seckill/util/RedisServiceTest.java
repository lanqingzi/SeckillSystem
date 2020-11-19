package com.okra.seckill.util;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RedisServiceTest {

    @Resource
    private RedisService redisService;

    @Test
    void setStockTest() {
        redisService.setValue("stock:19", 5L);
    }

    @Test
    void getStockTest() {
        String val = redisService.getValue("stock:19");
        System.out.println(val);
    }

    @Test
    public void stockDeductValidatorTest(){
        boolean result =  redisService.stockDeductValidator("stock:19");
        System.out.println("result:"+result);
        String stock =  redisService.getValue("stock:19");
        System.out.println("stock:"+stock);
    }
}