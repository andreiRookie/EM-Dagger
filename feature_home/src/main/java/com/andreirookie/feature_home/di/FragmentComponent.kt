package com.andreirookie.feature_home.di

import com.andreirookie.core.AppDependenciesFacade
import com.andreirookie.feature_home.presentation.FragmentHome
import dagger.Component

@FragmentScope
@Component(
    dependencies = [AppDependenciesFacade::class],
    modules = [FragmentModule::class]
)
interface FragmentComponent {

    fun inject(frag: FragmentHome)

    companion object {
        fun init(appDependenciesFacade: AppDependenciesFacade): FragmentComponent {
            return DaggerFragmentComponent.factory().create(appDependenciesFacade)
        }
    }

    @Component.Factory
    interface Factory {
        fun create(appDependenciesFacade: AppDependenciesFacade): FragmentComponent
    }
}