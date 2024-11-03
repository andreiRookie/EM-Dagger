package com.andreirookie.feature_home.di

import com.andreirookie.feature_home.data.FakeApiService
import com.andreirookie.feature_home.data.FakeApiServiceImpl
import dagger.Binds
import dagger.Module

@Module
internal interface ApiModule {

    @FragmentScope
    @ByFirstApi
    @Binds
    fun bindFirstApi(impl: FakeApiServiceImpl): FakeApiService

    @FragmentScope
    @BySecondApi
    @Binds
    fun bindSecondApi(impl: FakeApiServiceImpl): FakeApiService
}