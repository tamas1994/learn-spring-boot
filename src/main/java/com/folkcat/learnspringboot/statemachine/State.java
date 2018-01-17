package com.folkcat.learnspringboot.statemachine;

/**
 * Created by Tamas on 2018/1/17.
 */
public enum State {
    UNPAID,                 // 待支付
    WAITING_FOR_RECEIVE,    // 待收货
    DONE                    // 结束
}