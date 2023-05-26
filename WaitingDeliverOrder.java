package com.idcard.hs;

import android.util.Log;

/**
 * @FileName: WaitingDeliverOrder
 * @Author: yang
 * @Description: 订单发货状态
 * @History:
 */
class WaitingDeliverOrder implements OrderStateInterface {

    Order order;

    public WaitingDeliverOrder(Order order) {
        this.order = order;
    }

    @Override
    public void pay() {

    }

    @Override
    public void deliver() {
        //todo do deliver sth
        Log.i(TAG, "已发货，等待签收");
        order.setOrderState(new WaitingSignOrder(order));
    }

    @Override
    public void sign() {

    }

    @Override
    public void completeOrder() {

    }
}
