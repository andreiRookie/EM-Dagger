package com.andreirookie.core.data

import com.andreirookie.core.domain.IRetrofit
import retrofit2.Retrofit
import javax.inject.Inject

private const val SECOND_URL = "http://localhost:8888"

class SecondRetrofit @Inject constructor(
) : IRetrofit {
    override fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(SECOND_URL)
            .build()
    }
}