package com.idcard.hs;

import android.util.Log;

/**
 * @FileName: CreateOrder
 * @Author: yang
 * @Description: ��������
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
        Log.i(TAG,"�Ѹ���ȴ�����");
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
