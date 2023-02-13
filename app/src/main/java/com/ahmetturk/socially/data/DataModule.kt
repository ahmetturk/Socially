package com.ahmetturk.socially.data

import com.ahmetturk.socially.data.feed.FeedDataSource
import com.ahmetturk.socially.data.story.StoryDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun providesStoryDataSource(): StoryDataSource {
        return StoryDataSource()
    }

    @Provides
    @Singleton
    fun providesFeedDataSource(): FeedDataSource {
        return FeedDataSource()
    }

}
