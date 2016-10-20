package com.framwork.demo.giftedframwork.mvp.presenter.base;

import android.support.annotation.NonNull;

import com.framwork.demo.giftedframwork.listener.RequestCallBack;
import com.framwork.demo.giftedframwork.mvp.view.base.BaseView;
import com.framwork.demo.giftedframwork.utils.RxBus;

import rx.Subscription;

/**
 * Created by cty on 16/10/19.
 */
public class BasePresenterImpl<T extends BaseView, E> implements BasePresenter, RequestCallBack<E> {
    protected T mView;
    protected Subscription mSubscription;

    @Override
    public void onCreate() {

    }

    @Override
    public void onDestroy() {
        RxBus.cancelSubscription(mSubscription);
    }

    @Override
    public void attachView(@NonNull BaseView view) {
        // TODO?
        mView = (T) view;
    }

    @Override
    public void beforeRequest() {

    }

    @Override
    public void success(E data) {

    }

    @Override
    public void onError(String errorMsg) {

    }

}