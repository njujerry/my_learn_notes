/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */

package com.jerry.designpattern.strategy.example1;

/**
 * 策略接口
 *
 * @author cangniao.zjl
 * @version com.jerry.designpattern.strategy.example1.OperateNumberStrategy.java, v 0.1 2023年03月03日 14:53 cangniao.zjl
 */
public interface OperateNumberStrategy {

    /**
     * 操作两个整数
     * @param num1 整数1
     * @param num2 整数2
     * @return 操作结果
     */
    Integer operateNumber(Integer num1, Integer num2);
}