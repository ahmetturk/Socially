package com.ahmetturk.socially.screens.homepage

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ahmetturk.socially.data.story.Story
import com.ahmetturk.socially.databinding.ItemAddStoryBinding
import com.ahmetturk.socially.databinding.ItemStoryBinding

private const val ITEM_TYPE_ADD = 0
private const val ITEM_TYPE_STORY = 1

class StoriesAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var list: List<Story> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        return if (viewType == ITEM_TYPE_STORY) {
            val binding = ItemStoryBinding.inflate(inflater, parent, false)
            StoriesViewHolder(binding)
        } else {
            val binding = ItemAddStoryBinding.inflate(inflater, parent, false)
            AddStoryViewHolder(binding)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is StoriesViewHolder) {
            holder.bind(list[position - 1])
        }
    }

    override fun getItemCount() = list.size + 1

    override fun getItemViewType(position: Int): Int {
        return if (position == 0) ITEM_TYPE_ADD else ITEM_TYPE_STORY
    }

    fun setList(newList: List<Story>) {
        list = newList
        notifyDataSetChanged()
    }

}

class StoriesViewHolder(private val binding: ItemStoryBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(story: Story) {
        binding.storyImageView.setImageResource(story.photo)
    }
}

class AddStoryViewHolder(private val binding: ItemAddStoryBinding) : RecyclerView.ViewHolder(binding.root)
