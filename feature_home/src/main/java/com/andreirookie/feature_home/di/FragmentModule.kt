package com.andreirookie.feature_home.di

import dagger.Module

@Module(includes = [RepositoryModule::class, ApiModule::class])
internal interface FragmentModule