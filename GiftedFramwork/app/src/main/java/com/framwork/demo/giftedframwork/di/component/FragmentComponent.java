package com.framwork.demo.giftedframwork.di.component;


import android.app.Activity;
import android.content.Context;

import com.framwork.demo.giftedframwork.di.module.FragmentModule;
import com.framwork.demo.giftedframwork.di.scope.ContextLife;
import com.framwork.demo.giftedframwork.di.scope.PerFragment;

import dagger.Component;

@PerFragment
@Component(dependencies = ApplicationComponent.class, modules = FragmentModule.class)
public interface FragmentComponent {
    @ContextLife("Activity")
    Context getActivityContext();

    @ContextLife("Application")
    Context getApplicationContext();

    Activity getActivity();
    
}
