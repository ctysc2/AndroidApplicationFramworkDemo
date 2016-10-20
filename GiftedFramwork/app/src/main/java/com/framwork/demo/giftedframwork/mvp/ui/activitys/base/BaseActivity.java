package com.framwork.demo.giftedframwork.mvp.ui.activitys.base;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.WindowManager;

import com.framwork.demo.giftedframwork.R;
import com.framwork.demo.giftedframwork.annotation.BindValues;
import com.framwork.demo.giftedframwork.application.App;
import com.framwork.demo.giftedframwork.di.component.ActivityComponent;
import com.framwork.demo.giftedframwork.di.component.DaggerActivityComponent;
import com.framwork.demo.giftedframwork.di.component.DaggerApplicationComponent;
import com.framwork.demo.giftedframwork.di.component.DaggerServiceComponent;
import com.framwork.demo.giftedframwork.di.module.ActivityModule;
import com.framwork.demo.giftedframwork.mvp.presenter.base.BasePresenter;
import com.framwork.demo.giftedframwork.utils.RxBus;
import com.socks.library.KLog;

import butterknife.ButterKnife;
import rx.Subscription;

/**
 * Created by cty on 16/10/18.
 */
public abstract class BaseActivity<T extends BasePresenter> extends AppCompatActivity {

    protected T mPresenter;

    protected boolean mIsHasNavigationView;

    protected ActivityComponent mActivityComponent;

    public abstract int getLayoutId();

    public abstract void initInjector();

    public abstract void initViews();

    protected Subscription mSubscription;

    public ActivityComponent getActivityComponent() {
        return mActivityComponent;
    }

    private void initAnnotation() {
        if (getClass().isAnnotationPresent(BindValues.class)) {
            BindValues annotation = getClass().getAnnotation(BindValues.class);
            mIsHasNavigationView = annotation.mIsHasNavigationView();

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initAnnotation();
        initActivityComponent();
        int layout = getLayoutId();
        setContentView(layout);
        initInjector();
        ButterKnife.bind(this);


    }

    private void initActivityComponent() {
        mActivityComponent = DaggerActivityComponent.builder()
                .applicationComponent(((App) getApplication()).getApplicationComponent())
                .activityModule(new ActivityModule(this))
                .build();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mPresenter!=null)
            mPresenter.onDestroy();
        RxBus.cancelSubscription(mSubscription);

    }
}
