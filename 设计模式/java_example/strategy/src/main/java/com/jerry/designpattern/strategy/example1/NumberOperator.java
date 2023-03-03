/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.jerry.designpattern.strategy.example1;

/**
 * 策略执行者
 *
 * @author cangniao.zjl
 * @version NumberOperator.java, v 0.1 2023年03月03日 14:58 cangniao.zjl
 */
public class NumberOperator {

    /** 策略接口 */
    private OperateNumberStrategy strategy;

    /**
     * 策略执行者执行策略
     * @param num1 Integer
     * @param num2 Integer
     * @return Integer
     */
    Integer operateNumber(Integer num1, Integer num2) {
        return this.strategy.operateNumber(num1, num2);
    }

    /**
     * Setter method for property <tt>strategy</tt>.
     *
     * @param strategy value to be assigned to property strategy
     */
    public void setStrategy(OperateNumberStrategy strategy) {
        this.strategy = strategy;
    }
}