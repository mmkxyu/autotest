/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: GroupsOnClass1
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
@Test(groups = "stu")
public class GroupsOnClass1 {

    public void stu1(){
        System.out.println("GroupsOnClass1中的stu1运行");
    }

    public void stu2(){
        System.out.println("GroupsOnClass1中的stu2运行");
    }
}
