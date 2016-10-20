package com.framwork.demo.giftedframwork.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by cty on 16/10/18.
 */
public class GreenDaoHelper {

    private static GreenDaoHelper instance;
    private DaoSession daoSession;

    public GreenDaoHelper(Context context) {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(context, "migutv-db", null);
        SQLiteDatabase db = helper.getWritableDatabase();
        DaoMaster daoMaster = new DaoMaster(db);
        daoSession = daoMaster.newSession();
    }

    public static synchronized GreenDaoHelper getInstance(Context ctx) {
        if (instance == null)
            instance = new GreenDaoHelper(ctx.getApplicationContext());
        return instance;
    }


    public UserInfoDao getUserInfoDao(){
        return daoSession.getUserInfoDao();
    }
}
