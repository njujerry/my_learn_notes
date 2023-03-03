/*
 * Ant Group
 * Copyright (c) 2004-2023 All Rights Reserved.
 */
package com.jerry.designpattern.strategy.example1;

import org.testng.annotations.Test;

/**
 * 外部客户端的策略执行测试
 *
 * @author cangniao.zjl
 * @version NumberOperatorTest.java, v 0.1 2023年03月03日 15:04 cangniao.zjl
 */
public class NumberOperatorTest {

    /**
     * NumberOperatorTest 01
     */
    @Test
    public void test01() {
        NumberOperator numberOperator = new NumberOperator();
        numberOperator.setStrategy(new AddNumberStrategy());

        Integer result = numberOperator.operateNumber(12, 34);
        System.out.println("test result:" + result);
    }

    /**
     * NumberOperatorTest 02
     */
    @Test
    public void test02() {
        NumberOperator numberOperator = new NumberOperator();
        numberOperator.setStrategy(new JianNumberStrategy());

        Integer result = numberOperator.operateNumber(12, 34);
        System.out.println("test result:" + result);
    }

    /**
     * NumberOperatorTest 03
     */
    @Test
    public void test03() {
        NumberOperator numberOperator = new NumberOperator();
        numberOperator.setStrategy(new ChengNumberStrategy());

        Integer result = numberOperator.operateNumber(12, 34);
        System.out.println("test result:" + result);
    }
}