package com.framwork.demo.giftedframwork.mvp.interactor;

import com.framwork.demo.giftedframwork.listener.RequestCallBack;

import rx.Subscription;

/**
 * Created by cty on 16/10/19.
 */
public interface LoginInteractor<T> {
    Subscription login(RequestCallBack<T> callback,String username,String password,String logintype);
}
