/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ExpectedException
 * Author:   yml
 * Date:     2019/5/31 17:59
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
public class ExpectedException {
    /**
     * 期望结果为某一个异常的时候
     * 比如：我们传入了某些不合法的参数，程序跑出了一次
     */

    //这是一个失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }

    //这是一个失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是我的异常测试");
        throw new RuntimeException();

    }
}
