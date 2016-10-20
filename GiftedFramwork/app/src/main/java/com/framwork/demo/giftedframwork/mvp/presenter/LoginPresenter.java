package com.framwork.demo.giftedframwork.mvp.presenter;

import com.framwork.demo.giftedframwork.mvp.presenter.base.BasePresenter;

/**
 * Created by cty on 16/10/19.
 */
public interface LoginPresenter extends BasePresenter {

    void doLogin(String phone ,String password,String userType);
}
