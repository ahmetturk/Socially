package com.ahmetturk.socially.screens.splash

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ahmetturk.socially.R
import com.ahmetturk.socially.base.BaseFragment
import com.ahmetturk.socially.databinding.FragmentSplashBinding
import com.ahmetturk.socially.helper.drawOverStatusBar

class SplashFragment : BaseFragment<FragmentSplashBinding>() {

    override fun getViewBinding(container: ViewGroup?) =
        FragmentSplashBinding.inflate(layoutInflater, container, false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        drawOverStatusBar()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nextButtonImageView.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.action_splashFragment_to_homepageFragment)
        }
    }
}
