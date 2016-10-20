package com.framwork.demo.giftedframwork.mvp.presenter.impl;

import com.framwork.demo.giftedframwork.dao.UserInfo;
import com.framwork.demo.giftedframwork.mvp.interactor.LoginInteractor;
import com.framwork.demo.giftedframwork.mvp.interactor.impl.LoginInteractorImpl;
import com.framwork.demo.giftedframwork.mvp.presenter.LoginPresenter;
import com.framwork.demo.giftedframwork.mvp.presenter.base.BasePresenterImpl;
import com.framwork.demo.giftedframwork.mvp.view.LoginCompView;

import javax.inject.Inject;

/**
 * Created by cty on 16/10/19.
 */
public class LoginPresenterImpl extends BasePresenterImpl<LoginCompView,UserInfo> implements LoginPresenter{

    private LoginInteractor<UserInfo> mloginInteractor;

    @Inject
    public LoginPresenterImpl(LoginInteractorImpl mloginInteractorImpl){
        mloginInteractor = mloginInteractorImpl;

    }

    @Override
    public void doLogin(String phone, String password, String userType) {
        mSubscription = mloginInteractor.login(this,phone,password,userType);
    }

    @Override
    public void success(UserInfo data) {
        mView.showLoginInfo(data);
    }

    @Override
    public void onError(String errorMsg) {
        mView.showErrorMsg(errorMsg);
    }
}
