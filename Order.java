package com.xx;

/**
 * @FileName: Order
 * @Author: yang
 * @Description: 订单--即状态的宿主类、有委托的思想
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
     * 支付
     */
    void pay() {
        orderState.pay();
    }

    /**
     * 发货
     */
    void deliver() {
        orderState.deliver();
    }

    /**
     * 签收
     */
    void sign() {
        orderState.sign();
    }

    /**
     * 订单完成
     */
    void completeOrder() {
        orderState.completeOrder();
    }

}
