package com.ahmetturk.socially.repository

import com.ahmetturk.socially.data.feed.FeedDataSource
import com.ahmetturk.socially.data.story.StoryDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun providesRepository(
        storyDataSource: StoryDataSource,
        feedDataSource: FeedDataSource
    ): Repository {
        return Repository(storyDataSource, feedDataSource)
    }

}
