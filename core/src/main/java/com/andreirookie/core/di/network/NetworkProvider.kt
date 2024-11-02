package com.andreirookie.core.di.network

import com.andreirookie.core.di.First
import com.andreirookie.core.di.Second
import com.andreirookie.core.domain.IRetrofit

interface NetworkProvider {

    @First
    fun provideFirstRetrofit(): IRetrofit

    @Second
    fun provideSecondRetrofit(): IRetrofit
}