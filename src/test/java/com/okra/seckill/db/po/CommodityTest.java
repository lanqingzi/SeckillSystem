package com.okra.seckill.db.po;

import com.okra.seckill.db.mappers.SeckillCommodityMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CommodityTest {

    @Resource
    private SeckillCommodityMapper commodityMapper;
    @Test
    void CommodityTest1() {
        SeckillCommodity commodity = new SeckillCommodity();
        commodity.setCommodityDesc("test desc");
        commodity.setCommodityName("test name");
        commodity.setCommodityPrice(99);
        commodity.setId(1L);
        commodityMapper.insert(commodity);
        System.out.println("====>>>>" + commodityMapper.selectByPrimaryKey(1L));
    }
}