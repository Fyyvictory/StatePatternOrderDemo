package com.xx;

import android.util.Log;

/**
 * @FileName: CreateOrder
 * @Author: yang
 * @Description: 创建订单
 * @History:
 */
public class CreateOrder implements OrderStateInterface {

    private Order order;

    public CreateOrder(Order order) {
        this.order = order;
    }

    @Override
    public void pay() {
        //todo doing payment sth
        Log.i(TAG,"已付款，等待发货");
        order.setOrderState(new WaitingDeliverOrder(order));
    }

    @Override
    public void deliver() {

    }

    @Override
    public void sign() {
    }

    @Override
    public void completeOrder() {

    }
}
