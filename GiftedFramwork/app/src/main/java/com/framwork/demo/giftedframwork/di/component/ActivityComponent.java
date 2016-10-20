package com.framwork.demo.giftedframwork.di.component;

import android.app.Activity;
import android.content.Context;

import com.framwork.demo.giftedframwork.di.module.ActivityModule;
import com.framwork.demo.giftedframwork.di.scope.ContextLife;
import com.framwork.demo.giftedframwork.di.scope.PerActivity;
import com.framwork.demo.giftedframwork.mvp.ui.activitys.MainActivity;

import dagger.Component;

/**
 * Created by cty on 16/10/19.
 */
@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    @ContextLife("Activity")
    Context getActivityContext();

    @ContextLife("Application")
    Context getApplicationContext();

    Activity getActivity();

    void inject(MainActivity mainActivity);
}