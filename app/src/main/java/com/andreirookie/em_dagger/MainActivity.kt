package com.andreirookie.em_dagger

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.andreirookie.core.AppDependenciesFacadeProvider
import com.andreirookie.em_dagger.di.ActivityComponent
import com.andreirookie.feature_home.presentation.FragmentHome

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        ActivityComponent.init((application as AppDependenciesFacadeProvider).provideFacade())
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        supportFragmentManager.beginTransaction()
            .add(R.id.container, FragmentHome.create())
            .commit()
    }
}