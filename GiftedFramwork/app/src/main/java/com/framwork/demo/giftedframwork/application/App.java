package com.framwork.demo.giftedframwork.application;

import android.content.Context;
import android.support.multidex.MultiDexApplication;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.backends.okhttp.OkHttpImagePipelineConfigFactory;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.framwork.demo.giftedframwork.di.component.ApplicationComponent;
import com.framwork.demo.giftedframwork.di.component.DaggerApplicationComponent;
import com.framwork.demo.giftedframwork.di.module.ApplicationModule;
import com.framwork.demo.giftedframwork.utils.CrashHandler;
import com.squareup.okhttp.OkHttpClient;

/**
 * Created by cty on 16/10/18.
 */
public class App extends MultiDexApplication {
    private static Context sAppContext;
    private  ApplicationComponent mApplicationComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        sAppContext = this;
        //初始化崩溃日志
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(this);
        initApplicationComponent();

        //初始化Fresco
        ImagePipelineConfig config = OkHttpImagePipelineConfigFactory.newBuilder(this, new OkHttpClient())
                .setDownsampleEnabled(true)
                .build();
        Fresco.initialize(this, config);
    }

    public static Context getAppContext() {
        return sAppContext;
    }

    // Fixme
    private void initApplicationComponent() {
        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {
        return mApplicationComponent;
    }
}
