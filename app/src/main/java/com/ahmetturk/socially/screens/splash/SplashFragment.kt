package com.ahmetturk.socially.screens.splash

import android.view.ViewGroup
import com.ahmetturk.socially.base.BaseFragment
import com.ahmetturk.socially.databinding.FragmentSplashBinding

class SplashFragment : BaseFragment<FragmentSplashBinding>() {

    override fun getViewBinding(container: ViewGroup?) =
        FragmentSplashBinding.inflate(layoutInflater, container, false)

}