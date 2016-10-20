package com.framwork.demo.giftedframwork.mvp.presenter.base;

import android.support.annotation.NonNull;

import com.framwork.demo.giftedframwork.mvp.view.base.BaseView;

/**
 * Created by cty on 16/10/18.
 */
public interface BasePresenter {

    void onCreate();

    void attachView(@NonNull BaseView view);

    void onDestroy();
}
