package com.xx;

import android.util.Log;

/**
 * @FileName: CompleteOrder
 * @Author: yang
 * @Description: 订单完结
 * @History:
 */
public class CompleteOrder implements OrderStateInterface {
    Order order;

    public CompleteOrder(Order order) {
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

    }

    @Override
    public void completeOrder() {
        // todo do sth and close order
        Log.i(TAG, "¶©µ¥ÒÑÍê³É");
    }
}
