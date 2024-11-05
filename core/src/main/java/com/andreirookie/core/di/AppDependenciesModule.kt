package com.andreirookie.core.di

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppDependenciesModule(
    private val app: Application
) {

    @Singleton
    @Provides
    fun provideAppContext(): Context = app.applicationContext
}