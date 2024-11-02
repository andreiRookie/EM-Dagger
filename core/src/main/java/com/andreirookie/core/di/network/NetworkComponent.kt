package com.andreirookie.core.di.network

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface NetworkComponent : NetworkProvider {

    companion object {
        fun init(): NetworkProvider = DaggerNetworkComponent.builder().build()
    }
}