package com.andreirookie.core.data

import com.andreirookie.core.domain.IRetrofit
import retrofit2.Retrofit
import javax.inject.Inject

private const val FIRST_URL = "http://localhost:8080"

class FirstRetrofit @Inject constructor(
) : IRetrofit {
    override fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(FIRST_URL)
            .build()
    }
}