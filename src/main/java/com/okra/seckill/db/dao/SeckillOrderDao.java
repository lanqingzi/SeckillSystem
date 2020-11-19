package com.okra.seckill.db.dao;

import com.okra.seckill.db.po.SeckillOrder;

public interface SeckillOrderDao {

    public void insertOrder(SeckillOrder order);

    public SeckillOrder queryOrder(String orderNo);

    public void updateOrder(SeckillOrder order);
}
