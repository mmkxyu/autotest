/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ParameterTest
 * Author:   yml
 * Date:     2019/6/3 14:30
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @创建人 yumeiling
 * @创建时间 2019/6/3
 * @描述
 */
public class ParameterTest {

    @Test
    @Parameters({"username","password"})
    public void paramTest1(String username,String password){
        System.out.println("username:"+username+"password:"+password);
    }
}
