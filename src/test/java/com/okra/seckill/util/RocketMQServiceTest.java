package com.okra.seckill.util;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class RocketMQServiceTest {

    @Autowired
    private RocketMQService rocketMQService;

    @Test
    void sendMessage() throws Exception {
        rocketMQService.sendMessage("okra-rocketmq-test", "send test " + new Date().toString());
    }

    @Test
    void sendDelayMessage() {
    }
}