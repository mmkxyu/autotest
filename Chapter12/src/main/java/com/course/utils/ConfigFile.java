/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ConfigFile
 * Author:   yml
 * Date:     2019/6/24 11:06
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.course.utils;

import com.course.model.InterfaceName;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @创建人 yumeiling
 * @创建时间 2019/6/24
 * @描述
 */
public class ConfigFile {
        private static ResourceBundle bundle = ResourceBundle.getBundle("application",Locale.CHINA);

        public static String getUrl(InterfaceName name){
            String address = bundle.getString("test.url");
            String uri = "";
            //最终的测试地址
            String testUrl;
            if(name.equals(InterfaceName.GETUSERLIST)){
                uri = bundle.getString("getUserList.uri");
            }
            if(name.equals(InterfaceName.LOGIN)){
                uri = bundle.getString("login.uri");
            }
            if(name.equals(InterfaceName.UPDATEUSERINFO)){
                uri = bundle.getString("updateUserInfo.uri");
            }
            if(name.equals(InterfaceName.GETUSERINFO)){
                uri = bundle.getString("getUserInfo.uri");
            }
            if(name.equals(InterfaceName.ADDUSER)){
                uri = bundle.getString("addUser.uri");
            }
            testUrl= address+uri;
            return testUrl;
        }
}
