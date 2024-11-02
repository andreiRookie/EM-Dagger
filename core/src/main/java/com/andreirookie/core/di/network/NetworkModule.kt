package com.andreirookie.core.di.network

import com.andreirookie.core.data.FirstRetrofit
import com.andreirookie.core.data.SecondRetrofit
import com.andreirookie.core.di.First
import com.andreirookie.core.di.Second
import com.andreirookie.core.domain.IRetrofit
import dagger.Binds
import dagger.Module

@Module
interface NetworkModule {

    @First
    @Binds
    fun bindFirstRetrofit(
        impl: FirstRetrofit
    ) : IRetrofit

    @Second
    @Binds
    fun bindSecondRetrofit(
        impl: SecondRetrofit
    ) : IRetrofit
}