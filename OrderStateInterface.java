package com.idcard.hs;

/**
 * @FileName: OrderStateInterface
 * @Author: yang
 * @Description:订单状态接口
 * @History:
 */
interface OrderStateInterface {

    String TAG = "OrderStateInterface";

    /**
     * 支付
     */
    void pay();

    /**
     * 发货
     */
    void deliver();

    /**
     * 签收
     */
    void sign();

    /**
     * 订单完成
     */
    void completeOrder();
}
