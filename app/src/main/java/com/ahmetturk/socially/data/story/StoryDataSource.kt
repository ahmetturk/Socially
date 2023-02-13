package com.ahmetturk.socially.data.story

import com.ahmetturk.socially.R

class StoryDataSource {
    fun get(): List<Story> = listOf(
        Story(R.drawable.person1),
        Story(R.drawable.person2),
        Story(R.drawable.person3),
        Story(R.drawable.person1),
        Story(R.drawable.person2),
        Story(R.drawable.person3),
        Story(R.drawable.person1),
        Story(R.drawable.person2),
        Story(R.drawable.person3),
    )
}