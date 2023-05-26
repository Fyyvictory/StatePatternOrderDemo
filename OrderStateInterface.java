package com.idcard.hs;

/**
 * @FileName: OrderStateInterface
 * @Author: yang
 * @Description:����״̬�ӿ�
 * @History:
 */
interface OrderStateInterface {

    String TAG = "OrderStateInterface";

    /**
     * ֧��
     */
    void pay();

    /**
     * ����
     */
    void deliver();

    /**
     * ǩ��
     */
    void sign();

    /**
     * �������
     */
    void completeOrder();
}
