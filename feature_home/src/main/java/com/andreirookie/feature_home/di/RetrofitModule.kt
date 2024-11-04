package com.andreirookie.feature_home.di

import com.andreirookie.core.di.First
import com.andreirookie.core.di.Second
import com.andreirookie.core.domain.IRetrofit
import com.andreirookie.feature_home.data.FakeApiService
import dagger.Module
import dagger.Provides

@Module
object RetrofitModule {
    @FragmentScope
    @First
    @Provides
    fun provideFirstApi(@First retrofit: IRetrofit): FakeApiService {
        return retrofit.getRetrofit().create(FakeApiService::class.java)
    }

    @FragmentScope
    @Second
    @Provides
    fun provideSecondApi(@Second retrofit: IRetrofit): FakeApiService {
        return retrofit.getRetrofit().create(FakeApiService::class.java)
    }
}