/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: DataProviderTest
 * Author:   yml
 * Date:     2019/6/3 14:53
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @创建人 yumeiling
 * @创建时间 2019/6/3
 * @描述
 */
public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name="+name+",age="+age);
    }
    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}
        };
        return o;
    }
    @Test(dataProvider = "methodData")
    public void test1(String username,int age){
        System.out.println("test1方法：username="+username+",age="+age);
    }
    @Test(dataProvider = "methodData")
    public void test2(String username,int age){
        System.out.println("test2方法：username="+username+",age"+age);
    }
    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
            Object[][] result=null;
            if(method.getName().equals("test1")){
                result = new Object[][]{
                        {"zhangsan",10},
                        {"wangwu",20}
                };
            }else if(method.getName().equals("test2")){
                result = new Object[][]{
                        {"lisi",30},
                        {"test",40}
                };

            }else{
                return result;
            }
            return result;
    }
}
