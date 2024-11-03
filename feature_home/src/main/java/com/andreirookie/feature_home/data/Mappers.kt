package com.andreirookie.feature_home.data

import com.andreirookie.feature_home.domain.Message


internal fun MessageResponse.toDto(): Message {
    return Message(
            id = id,
            data = data
            )
}