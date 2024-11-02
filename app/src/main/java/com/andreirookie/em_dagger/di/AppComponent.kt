package com.andreirookie.em_dagger.di

import com.andreirookie.core.di.AppContextProvider
import com.andreirookie.core.di.AppDependenciesComponent
import com.andreirookie.core.di.network.NetworkProvider
import com.andreirookie.core.AppDependenciesFacade
import com.andreirookie.core.di.network.NetworkComponent
import com.andreirookie.em_dagger.MyApplication
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(dependencies = [AppContextProvider::class, NetworkProvider::class])
interface AppComponent : AppDependenciesFacade {

    companion object {
        fun init(app: MyApplication): AppDependenciesFacade {

            return DaggerAppComponent
                .factory()
                .create(
                    AppDependenciesComponent.init(app),
                    NetworkComponent.init()
                )
        }
    }

    @Component.Factory
    interface Factory {
        fun create(
            appContextProvider: AppContextProvider,
            networkProvider: NetworkProvider
        ): AppComponent
    }
}