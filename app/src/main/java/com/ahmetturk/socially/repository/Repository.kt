package com.ahmetturk.socially.repository

import com.ahmetturk.socially.data.feed.FeedDataSource
import com.ahmetturk.socially.data.story.StoryDataSource
import javax.inject.Inject

class Repository @Inject constructor(
    private val storyDataSource: StoryDataSource,
    private val feedDataSource: FeedDataSource
) {

    fun getStories() = storyDataSource.get()

    fun getFeeds() = feedDataSource.get()

}