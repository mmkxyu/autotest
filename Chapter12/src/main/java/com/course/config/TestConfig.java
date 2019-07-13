/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: TestConfig
 * Author:   yml
 * Date:     2019/6/24 10:57
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.course.config;

import org.apache.http.client.CookieStore;
import org.apache.http.impl.client.DefaultHttpClient;


/**
 * @创建人 yumeiling
 * @创建时间 2019/6/24
 * @描述
 */
public class TestConfig {
    public static String loginUrl;
    public static String updateUserInfoUrl;
    public static String getUserListUrl;
    public static String getUserInfoUrl;
    public static String addUserUrl;

    public static DefaultHttpClient defaultHttpClient;
    public static CookieStore store;
}
