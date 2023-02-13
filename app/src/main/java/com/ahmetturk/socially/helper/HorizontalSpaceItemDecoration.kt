package com.ahmetturk.socially.helper

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class HorizontalSpaceItemDecoration(private val spaceInPx: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        val position = parent.getChildAdapterPosition(view)
        if (position == RecyclerView.NO_POSITION) {
            return
        }

        if (position == parent.adapter!!.itemCount - 1) {
            outRect.right = 0
        } else {
            outRect.right = spaceInPx
        }

        outRect.top = 0
        outRect.bottom = 0
    }
}