package com.andreirookie.feature_home.data

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import java.util.concurrent.atomic.AtomicInteger
import javax.inject.Inject

interface FakeApiService {

    @GET("messages")
    suspend fun receiveMessages(): List<MessageResponse>

    @POST("messages")
    suspend fun addMessage(@Body request: MessageRequest): MessageResponse
}

class FakeApiServiceImpl @Inject constructor() : FakeApiService {

    private val apiMessages = mutableListOf<MessageResponse>()
    private val counter = AtomicInteger(0)

    override suspend fun receiveMessages(): List<MessageResponse> {
        return apiMessages
    }

    override suspend fun addMessage(request: MessageRequest): MessageResponse {
        val response = request.toResponse()
        apiMessages.add(response)
        return response
    }

    private fun MessageRequest.toResponse(): MessageResponse {
        return MessageResponse(
            id = counter.getAndDecrement(),
            data = data
        )
    }
}
//
//internal class SecondFakeApiService @Inject constructor() : FakeApiService {
//
//    private val apiMessages = mutableListOf<MessageResponse>()
//    private val counter = AtomicInteger(0)
//
//    override suspend fun receiveMessages(): List<MessageResponse> {
//        return apiMessages
//    }
//
//    override suspend fun addMessage(request: MessageRequest): MessageResponse {
//        val response = request.toResponse()
//        apiMessages.add(response)
//        return response
//    }
//
//    private fun MessageRequest.toResponse(): MessageResponse {
//        return MessageResponse(
//            id = counter.getAndDecrement(),
//            data = data
//        )
//    }
//}