package com.andreirookie.feature_home.domain

interface Repository {
    suspend fun getMessages(): List<Message>
    suspend fun sendMessage(text: String)
}


