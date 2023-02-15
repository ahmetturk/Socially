package com.ahmetturk.socially

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.children
import androidx.navigation.fragment.NavHostFragment
import com.ahmetturk.socially.databinding.ActivityMainBinding
import com.google.android.material.button.MaterialButton
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController

        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.splashFragment -> {
                    binding.bottomAppBar.visibility = View.GONE
                    binding.addButton.visibility = View.GONE
                }
                R.id.homepageFragment -> {
                    binding.bottomAppBar.visibility = View.VISIBLE
                    binding.addButton.visibility = View.VISIBLE
                    updateMenuColors(binding.homeButton)
                }
            }
        }
    }

    private fun updateMenuColors(selected: MaterialButton) {
        val menuList = binding.menuConstraintLayout.children.toMutableList()
        menuList.remove(selected)

        selected.setIconTintResource(R.color.selected_menu)

        menuList.forEach {
            (it as MaterialButton).setIconTintResource(R.color.black)
        }
    }
}