package com.idcard.hs;

/**
 * @FileName: ContextHolder
 * @Author: yang
 * @Description: ����--��״̬�������ࡢ��ί�е�˼��
 * @History:
 */
class Order {

    OrderStateInterface orderState;

    public Order() {
        orderState = new CreateOrder(this);
    }

    public OrderStateInterface getOrderState() {
        return orderState;
    }

    public void setOrderState(OrderStateInterface orderState) {
        this.orderState = orderState;
    }

    /**
     * ֧��
     */
    void pay() {
        orderState.pay();
    }

    /**
     * ����
     */
    void deliver() {
        orderState.deliver();
    }

    /**
     * ǩ��
     */
    void sign() {
        orderState.sign();
    }

    /**
     * �������
     */
    void completeOrder() {
        orderState.completeOrder();
    }

}
