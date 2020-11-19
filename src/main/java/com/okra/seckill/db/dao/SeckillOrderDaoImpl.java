package com.okra.seckill.db.dao;

import com.okra.seckill.db.mappers.SeckillOrderMapper;
import com.okra.seckill.db.po.SeckillOrder;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository
public class SeckillOrderDaoImpl implements SeckillOrderDao {

    @Resource
    private SeckillOrderMapper orderMapper;

    @Override
    public void insertOrder(SeckillOrder order) {
        orderMapper.insert(order);
    }

    @Override
    public SeckillOrder queryOrder(String orderNo) {
        return orderMapper.selectByOrderNo(orderNo);
    }

    @Override
    public void updateOrder(SeckillOrder order) {
        orderMapper.updateByPrimaryKey(order);
    }

}
