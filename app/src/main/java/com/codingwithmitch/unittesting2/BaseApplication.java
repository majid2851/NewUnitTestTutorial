package com.codingwithmitch.unittesting2;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
//import com.codingwithmitch.unittesting2.di.;
public class BaseApplication extends DaggerApplication
{
    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector()
    {
        return null;
    }
}
