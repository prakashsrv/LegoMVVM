package com.pack.legomvvm

import android.app.Activity
import android.app.Application
import com.pack.legomvvm.di.AppInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

class App: Application(), HasActivityInjector {
    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()

       AppInjector.init(this)
    }

    override fun activityInjector() = dispatchingAndroidInjector

}