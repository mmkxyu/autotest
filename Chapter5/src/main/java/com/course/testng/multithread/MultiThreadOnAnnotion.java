/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MultiThreadOnAnnotion
 * Author:   yml
 * Date:     2019/6/3 16:57
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.course.testng.multithread;

import org.testng.annotations.Test;

/**
 * @创建人 yumeiling
 * @创建时间 2019/6/3
 * @描述
 */
public class MultiThreadOnAnnotion {

    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread id %s%n",Thread.currentThread().getId());
    }
}
