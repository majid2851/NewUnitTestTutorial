package com.codingwithmitch.unittesting2.di;

import android.app.Application;

import com.codingwithmitch.unittesting2.BaseApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        ActivityBuildersModule.class,
        ViewModelFactoryModule.class
    }
)
interface AppComponent2851 extends AndroidInjector<BaseApplication>
{
    @Component.Builder
    interface Builder
    {
        @BindsInstance
        Builder builder(Application application);

        AppComponent2851 build();
    }







}
