package com.framwork.demo.giftedframwork.utils;

import android.content.Context;

import com.framwork.demo.giftedframwork.dao.GreenDaoHelper;
import com.framwork.demo.giftedframwork.dao.UserInfo;
import com.framwork.demo.giftedframwork.dao.UserInfoDao;

import java.util.List;

/**
 * Created by cty on 16/10/20.
 */
public class LoginUtils{

    public static void insertLoginInfo(Context context, UserInfo userInfo){

        UserInfoDao userInfoDao = GreenDaoHelper.getInstance(context).getUserInfoDao();

        userInfoDao.insert(userInfo);

    }


    public static List<UserInfo>  getAllUserInfo(Context context){
        UserInfoDao userInfoDao = GreenDaoHelper.getInstance(context).getUserInfoDao();
        return userInfoDao.loadAll();
    }


    public static   void clearAllUserInfo(Context context){
        UserInfoDao userInfoDao = GreenDaoHelper.getInstance(context).getUserInfoDao();
        userInfoDao.deleteAll();
    }
}
