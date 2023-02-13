package com.ahmetturk.socially.screens.homepage

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewOutlineProvider
import androidx.recyclerview.widget.RecyclerView
import com.ahmetturk.socially.data.feed.Feed
import com.ahmetturk.socially.databinding.ItemFeedBinding

class FeedsAdapter : RecyclerView.Adapter<FeedsViewHolder>() {

    private var list: List<Feed> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemFeedBinding.inflate(inflater, parent, false)

        binding.likedBlurView.setupWith(binding.parentView)
            .setBlurRadius(6f)
        binding.likedBlurView.outlineProvider = ViewOutlineProvider.BACKGROUND
        binding.likedBlurView.clipToOutline = true

        binding.commentsBlurView.setupWith(binding.parentView)
            .setBlurRadius(6f)
        binding.commentsBlurView.outlineProvider = ViewOutlineProvider.BACKGROUND
        binding.commentsBlurView.clipToOutline = true

        binding.savedBlurView.setupWith(binding.parentView)
            .setBlurRadius(6f)
        binding.savedBlurView.outlineProvider = ViewOutlineProvider.BACKGROUND
        binding.savedBlurView.clipToOutline = true

        return FeedsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FeedsViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount() = list.size

    fun setList(newList: List<Feed>) {
        list = newList
        notifyDataSetChanged()
    }

}

class FeedsViewHolder(private val binding: ItemFeedBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(feed: Feed) {
        binding.personImageView.setImageResource(feed.personPhoto)
        binding.nameTextView.text = feed.name
        binding.timeTextView.text = feed.time
        binding.feedImageView.setImageResource(feed.photo)
        binding.likedTextView.text = feed.liked
        binding.commentsTextView.text = feed.comments
        binding.savedTextView.text = feed.saved
    }
}