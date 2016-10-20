package com.framwork.demo.giftedframwork.di.component;


import android.content.Context;

import com.framwork.demo.giftedframwork.di.module.ApplicationModule;
import com.framwork.demo.giftedframwork.di.scope.ContextLife;
import com.framwork.demo.giftedframwork.di.scope.PerApp;

import dagger.Component;


@PerApp
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    @ContextLife("Application")
    Context getApplication();

}

