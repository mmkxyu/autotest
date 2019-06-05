/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: SuiteConfig
 * Author:   yml
 * Date:     2019/5/31 17:16
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @创建人 yumeiling
 * @创建时间 2019/5/31
 * @描述
 */
public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite运行啦");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite运行啦");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("before test 运行啦");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("after test 运行啦");
    }
}
