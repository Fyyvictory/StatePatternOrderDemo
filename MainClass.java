package com.idcard.hs;

/**
 * @FileName: MainClass
 * @Author: yang
 * @Description:
 * @History:
 */
class MainClass {

    public static void main(String[] args) {
        Order order = new Order();
        order.pay();
        order.deliver();
        order.sign();
        order.completeOrder();
    }
}
