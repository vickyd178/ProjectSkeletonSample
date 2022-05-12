package com.avion.projectskeletonsample.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.avion.projectskeletonsample.databinding.ActivityNavigationTypeBinding

class NavigationTypeActivity : AppCompatActivity() {

    private var _binding: ActivityNavigationTypeBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityNavigationTypeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            buttonLogin.setOnClickListener {
                MainActivity.open(this@NavigationTypeActivity, true)
            }
            buttonNotLogin.setOnClickListener {
                MainActivity.open(this@NavigationTypeActivity, false)
            }
        }

    }

}