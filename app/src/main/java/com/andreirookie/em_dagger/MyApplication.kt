package com.andreirookie.em_dagger

import android.app.Application
import com.andreirookie.core.AppDependenciesFacadeProvider
import com.andreirookie.core.AppDependenciesFacade
import com.andreirookie.em_dagger.di.AppComponent

class MyApplication : Application(), AppDependenciesFacadeProvider {

    private lateinit var appComponent: AppDependenciesFacade

    override fun onCreate() {
        super.onCreate()
        appComponent = AppComponent.init(this)
    }

    override fun provideFacade(): AppDependenciesFacade {
        return appComponent
    }
}