package com.andreirookie.feature_home.data

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface FakeApiService {

    @GET("messages")
    fun receiveMessages(): List<MessageResponse>

    @POST("messages")
    fun addMessage(@Body request: MessageRequest): MessageResponse
}