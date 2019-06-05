/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: TimeOutTest
 * Author:   yml
 * Date:     2019/6/5 11:14
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.course.testng;

import org.testng.annotations.Test;

/**
 * @创建人 yumeiling
 * @创建时间 2019/6/5
 * @描述
 */
public class TimeOutTest {
    @Test(timeOut = 3000)
    public void testSuccess() throws InterruptedException{
        Thread.sleep(2000);
    }

    /**
     * 期望2s结果，但是我实际执行了3s，那么就会超时
     * @throws InterruptedException
     */
    @Test(timeOut = 2000)
    public void testFailed() throws InterruptedException{
        Thread.sleep(3000);
    }
}
