package com.ahmetturk.socially.screens.homepage

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ahmetturk.socially.data.feed.Feed
import com.ahmetturk.socially.data.story.Story
import com.ahmetturk.socially.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomepageViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {

    private val _stories = MutableLiveData<List<Story>>(emptyList())
    val stories: LiveData<List<Story>>
        get() = _stories

    private val _feeds = MutableLiveData<List<Feed>>(emptyList())
    val feeds: LiveData<List<Feed>>
        get() = _feeds

    init {
        _stories.value = repository.getStories()

        _feeds.value = repository.getFeeds()
    }

}