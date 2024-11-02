package com.andreirookie.core.di

import android.app.Application
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppDependenciesModule::class])
interface AppDependenciesComponent : AppContextProvider {

    companion object {
        fun init(app: Application): AppContextProvider {
            return DaggerAppDependenciesComponent
                .builder()
                .appDependenciesModule(AppDependenciesModule(app))
                .build()
        }
    }
}