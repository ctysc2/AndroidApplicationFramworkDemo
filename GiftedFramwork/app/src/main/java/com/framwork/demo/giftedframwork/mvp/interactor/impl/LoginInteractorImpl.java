package com.framwork.demo.giftedframwork.mvp.interactor.impl;

import android.widget.Toast;

import com.framwork.demo.giftedframwork.common.HostType;
import com.framwork.demo.giftedframwork.dao.UserInfo;
import com.framwork.demo.giftedframwork.listener.RequestCallBack;
import com.framwork.demo.giftedframwork.mvp.entity.LoginEntity;
import com.framwork.demo.giftedframwork.mvp.interactor.LoginInteractor;
import com.framwork.demo.giftedframwork.repository.network.RetrofitManager;
import com.framwork.demo.giftedframwork.utils.TransformUtils;
import com.socks.library.KLog;

import java.util.Map;

import javax.inject.Inject;

import rx.Observer;
import rx.Subscription;
import rx.functions.Func1;

/**
 * Created by cty on 16/10/19.
 */
public class LoginInteractorImpl implements LoginInteractor<UserInfo> {

    @Inject
    public LoginInteractorImpl(){

    }
    @Override
    public Subscription login(final RequestCallBack<UserInfo> callback, String phone, String password, String logintype) {
        return RetrofitManager.getInstance(HostType.LOGIN).login(phone,password,logintype)
                .map(new Func1<LoginEntity, UserInfo>() {
                    @Override
                    public UserInfo call(LoginEntity entity) {
                        KLog.d(Thread.currentThread().getName());
                        if(entity.getStatus() == 0){
                            UserInfo info = new UserInfo();
                            info.setId(entity.data.getId());
                            info.setNickname(entity.data.getNickname());
                            info.setHeadurl(entity.data.getHeadImage());
                            return info;
                        }else
                        {
                            return null;
                        }


                    }
                })
                .compose(TransformUtils.<UserInfo>defaultSchedulers())
                .subscribe(new Observer<UserInfo>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        KLog.e(e.toString());
                        callback.onError(e.toString());
                    }

                    @Override
                    public void onNext(UserInfo newsDetail) {
                        callback.success(newsDetail);
                    }
                });
    }
}
