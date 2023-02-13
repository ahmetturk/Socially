package com.ahmetturk.socially.screens.homepage

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.ahmetturk.socially.R
import com.ahmetturk.socially.base.BaseFragment
import com.ahmetturk.socially.databinding.FragmentHomepageBinding
import com.ahmetturk.socially.helper.HorizontalSpaceItemDecoration
import com.ahmetturk.socially.helper.drawOverStatusBar
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomepageFragment : BaseFragment<FragmentHomepageBinding>() {

    private val viewModel: HomepageViewModel by viewModels()

    private val storiesAdapter by lazy { StoriesAdapter() }
    private val feedsAdapter by lazy { FeedsAdapter() }

    override fun getViewBinding(container: ViewGroup?) =
        FragmentHomepageBinding.inflate(layoutInflater, container, false)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        drawOverStatusBar(applyPadding = false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.storiesRecyclerView.addItemDecoration(
            HorizontalSpaceItemDecoration(spaceInPx = resources.getDimensionPixelOffset(R.dimen.margin_30dp))
        )
        binding.storiesRecyclerView.adapter = storiesAdapter

        viewModel.stories.observe(viewLifecycleOwner) {
            storiesAdapter.setList(it)
        }

        binding.feedRecyclerView.adapter = feedsAdapter

        viewModel.feeds.observe(viewLifecycleOwner) {
            feedsAdapter.setList(it)
        }
    }
}