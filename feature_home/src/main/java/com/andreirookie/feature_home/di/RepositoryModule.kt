package com.andreirookie.feature_home.di

import com.andreirookie.feature_home.data.FirstRepository
import com.andreirookie.feature_home.data.SecondRepository
import com.andreirookie.feature_home.domain.Repository
import dagger.Binds
import dagger.Module

@Module
internal interface RepositoryModule {

    @ByFirstApi
    @FragmentScope
    @Binds
    fun bindFirstRepository(impl: FirstRepository): Repository

    @BySecondApi
    @FragmentScope
    @Binds
    fun bindSecondRepository(impl: SecondRepository): Repository
}