package com.andreirookie.feature_home.presentation

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.andreirookie.core.AppDependenciesFacadeProvider
import com.andreirookie.core.di.First
import com.andreirookie.core.di.Second
import com.andreirookie.core.domain.IRetrofit
import com.andreirookie.feature_home.di.FragmentComponent
import javax.inject.Inject

class FragmentHome : Fragment() {

    @First
    @Inject
    lateinit var firstRetrofit: IRetrofit

    override fun onAttach(context: Context) {
        FragmentComponent
            .init((requireActivity().application as AppDependenciesFacadeProvider).provideFacade())
            .inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "Here comes the First one: ${firstRetrofit::class.simpleName}")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    @Inject
    fun setSecondRetrofit(@Second secondRetrofit: IRetrofit) {
        Log.d(TAG, "Here comes the Second one: ${secondRetrofit::class.simpleName}")
    }

        companion object {
        fun create() = FragmentHome()

        const val TAG = "fragment_home_tag"
    }
}