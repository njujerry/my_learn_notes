/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.jerry.designpattern.strategy.example1;

/**
 * 策略实现类-乘法
 * 
 * @author cangniao.zjl
 * @version ChengNumberStrategy.java, v 0.1 2023年03月03日 14:56 cangniao.zjl
 */
public class ChengNumberStrategy implements OperateNumberStrategy {

    /**
     * 操作两个整数
     *
     * @param num1 整数1
     * @param num2 整数2
     * @return 操作结果
     */
    @Override
    public Integer operateNumber(Integer num1, Integer num2) {
        return num1 * num2;
    }
}