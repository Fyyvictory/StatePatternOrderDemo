package com.idcard.hs;

import android.util.Log;

/**
 * @FileName: WaitingDeliverOrder
 * @Author: yang
 * @Description: ��������״̬
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
        Log.i(TAG, "�ѷ������ȴ�ǩ��");
        order.setOrderState(new WaitingSignOrder(order));
    }

    @Override
    public void sign() {

    }

    @Override
    public void completeOrder() {

    }
}
