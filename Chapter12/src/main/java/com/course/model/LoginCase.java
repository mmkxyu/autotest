/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: LoginCase
 * Author:   yml
 * Date:     2019/6/20 15:45
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
public class LoginCase {
    private int id;
    private String userName;
    private String password;
    private String expected;
}
