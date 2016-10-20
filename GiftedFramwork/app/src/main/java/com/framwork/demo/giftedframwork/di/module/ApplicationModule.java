package com.framwork.demo.giftedframwork.di.module;

import android.content.Context;


import com.framwork.demo.giftedframwork.application.App;
import com.framwork.demo.giftedframwork.di.scope.ContextLife;
import com.framwork.demo.giftedframwork.di.scope.PerApp;

import dagger.Module;
import dagger.Provides;


@Module
public class ApplicationModule {
    private App mApplication;

    public ApplicationModule(App application) {
        mApplication = application;
    }

    @Provides
    @PerApp
    @ContextLife("Application")
    public Context provideApplicationContext() {
        return mApplication.getApplicationContext();
    }

}
