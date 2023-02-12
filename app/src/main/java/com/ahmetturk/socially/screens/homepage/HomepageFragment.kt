package com.ahmetturk.socially.screens.homepage

import android.view.ViewGroup
import com.ahmetturk.socially.base.BaseFragment
import com.ahmetturk.socially.databinding.FragmentHomepageBinding

class HomepageFragment : BaseFragment<FragmentHomepageBinding>() {

    override fun getViewBinding(container: ViewGroup?) =
        FragmentHomepageBinding.inflate(layoutInflater, container, false)

}