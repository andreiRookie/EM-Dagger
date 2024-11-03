package com.andreirookie.feature_home.presentation

import android.content.Context
import androidx.fragment.app.Fragment
import com.andreirookie.core.AppDependenciesFacadeProvider
import com.andreirookie.feature_home.di.ByFirstApi
import com.andreirookie.feature_home.di.BySecondApi
import com.andreirookie.feature_home.di.FragmentComponent
import com.andreirookie.feature_home.domain.Repository
import javax.inject.Inject

class FragmentWithCounter : Fragment() {

    @ByFirstApi
    @Inject
    lateinit var firstRepository: Repository

    override fun onAttach(context: Context) {
        FragmentComponent
            .init((requireActivity().application as AppDependenciesFacadeProvider).provideFacade())
            .inject(this)
        super.onAttach(context)
    }


    @Inject
    fun setSecondRepository(@BySecondApi repository: Repository) {

    }
}