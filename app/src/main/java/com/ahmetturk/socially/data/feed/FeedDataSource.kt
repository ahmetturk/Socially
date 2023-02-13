package com.ahmetturk.socially.data.feed

import com.ahmetturk.socially.R

class FeedDataSource {
    fun get(): List<Feed> = listOf(
        Feed(
            personPhoto = R.drawable.feedperson1,
            photo = R.drawable.view1,
            name = "Dennis Reynolds",
            time = "2 hrs ago",
            liked = "5.2K",
            comments = "1.1K",
            saved = "362"
        ),
        Feed(
            personPhoto = R.drawable.feedperson2,
            photo = R.drawable.view2,
            name = "Charlie Kelly",
            time = "4 hrs ago",
            liked = "4.1K",
            comments = "2.2K",
            saved = "251"
        ),
        Feed(
            personPhoto = R.drawable.feedperson1,
            photo = R.drawable.view1,
            name = "Dennis Reynolds",
            time = "2 hrs ago",
            liked = "5.2K",
            comments = "1.1K",
            saved = "362"
        ),
        Feed(
            personPhoto = R.drawable.feedperson2,
            photo = R.drawable.view2,
            name = "Charlie Kelly",
            time = "4 hrs ago",
            liked = "4.1K",
            comments = "2.2K",
            saved = "251"
        ),
    )
}