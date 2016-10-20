package com.framwork.demo.giftedframwork.common;

/**
 * Created by cty on 16/10/18.
 */
public class ApiConstants {

        public static String VERSIONCODE="v2.2";

        public static String IP = "http://www.migugk.com";

        //端口号
        public static String PORT = ":8080";


        //项目
        public static String BASE_PROJECT = "gk/";
        //服务器地址

        //接口BASE地址
        public static String BASE_URL = IP     + "/"+BASE_PROJECT+VERSIONCODE+"/";

        //图片服务器
        public static String BASE_URL_PICTURE = "http://www.migugk.com/gkfiles/";


        //获取接口类型
        public static String getHost(int hostType) {

            String host;

            switch (hostType) {
                case HostType.LOGIN:
                    host = BASE_URL;
                    break;
                default:
                    host = "";
                    break;
            }
            return host;
        }
}
