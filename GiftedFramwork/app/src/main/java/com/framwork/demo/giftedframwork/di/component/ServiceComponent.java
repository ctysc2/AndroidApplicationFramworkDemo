package com.framwork.demo.giftedframwork.di.component;

import android.content.Context;


import com.framwork.demo.giftedframwork.di.module.ServiceModule;
import com.framwork.demo.giftedframwork.di.scope.ContextLife;
import com.framwork.demo.giftedframwork.di.scope.PerService;

import dagger.Component;


@PerService
@Component(dependencies = ApplicationComponent.class, modules = ServiceModule.class)
public interface ServiceComponent {
    @ContextLife("Service")
    Context getServiceContext();

    @ContextLife("Application")
    Context getApplicationContext();
}
