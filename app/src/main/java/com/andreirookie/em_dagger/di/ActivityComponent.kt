package com.andreirookie.em_dagger.di

import com.andreirookie.core.AppDependenciesFacade
import dagger.Component

@Component(dependencies = [AppDependenciesFacade::class])
interface ActivityComponent {

    @Component.Factory
    interface Factory{
        fun create(appDependenciesFacade: AppDependenciesFacade): ActivityComponent
    }

    companion object {
        fun init(appDependenciesFacade: AppDependenciesFacade): ActivityComponent =
            DaggerActivityComponent
                .factory()
                .create(appDependenciesFacade)
    }
}