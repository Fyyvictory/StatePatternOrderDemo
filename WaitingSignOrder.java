package com.xx;

import android.util.Log;

/**
 * @FileName: WaitingSignOrder
 * @Author: yang
 * @Description: 已发货，待签收
 * @History:
 */
public class WaitingSignOrder implements OrderStateInterface {
    Order order;

    public WaitingSignOrder(Order order) {
        this.order = order;
    }

    @Override
    public void pay() {

    }

    @Override
    public void deliver() {

    }

    @Override
    public void sign() {
        //todo do sign sth
        Log.i(TAG, "已签收，订单完成");
        order.setOrderState(new CompleteOrder(order));
    }

    @Override
    public void completeOrder() {

    }
}
