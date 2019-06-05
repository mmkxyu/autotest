/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: GroupsOnClass3
 * Author:   yml
 * Date:     2019/5/31 17:48
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @创建人 yumeiling
 * @创建时间 2019/5/31
 * @描述
 */
@Test(groups = "teacher")
public class GroupsOnClass3 {

    public void teacher1(){
        System.out.println("GroupsOnClass3中的teacher1运行");
    }

    public void teacher2(){
        System.out.println("GroupsOnClass3中的teacher2运行");
    }
}
