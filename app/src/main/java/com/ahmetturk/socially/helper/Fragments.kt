package com.ahmetturk.socially.helper

import android.view.ViewGroup
import androidx.core.view.ViewCompat
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import com.ahmetturk.socially.base.BaseFragment

fun BaseFragment<*>.drawOverStatusBar() {
    lifecycle.addObserver(object : DefaultLifecycleObserver {

        override fun onStart(owner: LifecycleOwner) {
            WindowCompat.setDecorFitsSystemWindows(requireActivity().window, false)

            ViewCompat.setOnApplyWindowInsetsListener(binding.root) { view, windowInsets ->
                val insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars())

                view.layoutParams = (view.layoutParams as ViewGroup.MarginLayoutParams).apply {
                    leftMargin = insets.left
                    bottomMargin = insets.bottom
                    rightMargin = insets.right
                }

                view.setPadding(0, insets.top, 0, 0)

                WindowInsetsCompat.CONSUMED
            }
        }

        override fun onStop(owner: LifecycleOwner) {
            WindowCompat.setDecorFitsSystemWindows(requireActivity().window, true)
        }

    })
}
