/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: DependTest
 * Author:   yml
 * Date:     2019/5/31 18:07
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.course.testng;

import org.testng.annotations.Test;

/**
 * @创建人 yumeiling
 * @创建时间 2019/5/31
 * @描述
 */
public class DependTest {
    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }
    @Test(dependsOnMethods = "test1")
    public void test2(){
        System.out.println("test2 run");
    }
}
