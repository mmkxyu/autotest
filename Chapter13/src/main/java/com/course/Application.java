/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Application
 * Author:   yml
 * Date:     2019/7/5 18:09
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @创建人 yumeiling
 * @创建时间 2019/7/5
 * @描述
 */
@EnableScheduling
@SpringBootApplication
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class,args);
    }
}
