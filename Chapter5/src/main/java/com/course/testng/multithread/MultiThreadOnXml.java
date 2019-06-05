/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MultiThreadOnXml
 * Author:   yml
 * Date:     2019/6/5 10:14
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.course.testng.multithread;

import org.testng.annotations.Test;

/**
 * @创建人 yumeiling
 * @创建时间 2019/6/5
 * @描述
 */
public class MultiThreadOnXml {
    @Test
    public void test1(){
        System.out.printf("Thread Id:  %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("Thread Id:  %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("Thread Id:  %s%n",Thread.currentThread().getId());
    }
}
