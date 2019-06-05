/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: BasicAnnotation
 * Author:   yml
 * Date:     2019/5/31 16:14
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.course.testng;

import org.testng.annotations.*;

/**
 * @创建人 yumeiling
 * @创建时间 2019/5/31
 * @描述
 */
public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("在test方法之前执行");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("在test方法之后运行");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("在类运行之前运行");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("在类运行之后运行");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforeSuite运行");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite运行");
    }
}
