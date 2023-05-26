package com.xx;

/**
 * @FileName: MainClass
 * @Author: yang
 * @Description:
 * @History:
 */
class MainClass {

    public static void main(String[] args) {
        Order order = new Order();
        //方法一： order.getState(); blabla
        order.pay();
        order.deliver();
        order.sign();
        order.completeOrder();
    }
}
