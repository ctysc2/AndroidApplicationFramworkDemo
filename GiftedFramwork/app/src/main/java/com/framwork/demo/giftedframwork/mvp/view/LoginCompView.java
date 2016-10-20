package com.framwork.demo.giftedframwork.mvp.view;

import com.framwork.demo.giftedframwork.dao.UserInfo;
import com.framwork.demo.giftedframwork.mvp.view.base.BaseView;

/**
 * Created by cty on 16/10/19.
 */
public interface LoginCompView extends BaseView {
    void showLoginInfo(UserInfo info);
}
