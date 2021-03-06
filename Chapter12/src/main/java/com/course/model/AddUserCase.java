/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: AddUserCase
 * Author:   yml
 * Date:     2019/6/20 15:36
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.course.model;

import lombok.Data;

/**
 * @创建人 yumeiling
 * @创建时间 2019/6/20
 * @描述
 */
@Data
public class AddUserCase {
    private String userName;
    private String password;
    private String sex;
    private String age;
    private String permission;
    private String isDelete;
    private String expected;
}
