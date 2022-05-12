package com.avion.projectskeletonsample.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.NavGraph
import androidx.navigation.fragment.NavHostFragment
import com.avion.projectskeletonsample.R
import com.avion.projectskeletonsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    private lateinit var navController: NavController
    private lateinit var navGraph: NavGraph

    companion object {
        const val IS_USER_LOGGED_IN = "isUserLogin"
        fun open(context: Context, isLogin: Boolean) {
            context.startActivity(Intent(context, MainActivity::class.java).apply {
                putExtra(IS_USER_LOGGED_IN, isLogin)
            })
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        val graphInflater = navHostFragment.navController.navInflater
        navGraph = graphInflater.inflate(R.navigation.nav_graph)
        navController = navHostFragment.navController

        val destination = if (
            intent.getBooleanExtra(
                IS_USER_LOGGED_IN,
                true
            )
        ) R.id.navHomeFragment else R.id.navLoginFragment

        navGraph.setStartDestination(destination)
        navController.graph = navGraph

    }
}