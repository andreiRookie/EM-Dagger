package com.andreirookie.core.di

import android.content.Context

interface AppContextProvider {
    fun appContext(): Context
}