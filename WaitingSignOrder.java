package com.idcard.hs;

import android.util.Log;

/**
 * @FileName: WaitingSignOrder
 * @Author: yang
 * @Description: �ѷ�������ǩ��
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
        Log.i(TAG, "��ǩ�գ��������");
        order.setOrderState(new CompleteOrder(order));
    }

    @Override
    public void completeOrder() {

    }
}
