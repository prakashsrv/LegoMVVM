package com.pack.legomvvm.di

import android.app.Application
import com.pack.legomvvm.App
import dagger.BindsInstance
import dagger.Component

interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }

    fun inject(application: App)
}
