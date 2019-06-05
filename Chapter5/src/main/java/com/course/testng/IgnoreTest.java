/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: IgnoreTest
 * Author:   yml
 * Date:     2019/5/31 17:35
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
public class IgnoreTest {
    @Test
    public void ignore1(){
        System.out.println("ignore1 执行");
    }
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 执行");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3 执行");
    }
}
