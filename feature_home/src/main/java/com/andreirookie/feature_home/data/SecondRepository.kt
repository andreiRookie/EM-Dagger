package com.andreirookie.feature_home.data

import com.andreirookie.feature_home.di.BySecondApi
import com.andreirookie.feature_home.domain.Message
import com.andreirookie.feature_home.domain.Repository
import javax.inject.Inject

class SecondRepository @Inject constructor(
    @BySecondApi
    private val apiService: FakeApiService
) : Repository {
    override suspend fun getMessages(): List<Message> {
        return apiService.receiveMessages().map { it.toDto() }
    }

    override suspend fun sendMessage(text: String) {
        apiService.addMessage(MessageRequest(text))
    }
}