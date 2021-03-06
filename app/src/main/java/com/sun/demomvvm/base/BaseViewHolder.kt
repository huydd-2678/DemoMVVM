package com.sun.demomvvm.base

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView

abstract class BaseViewHolder<T>(
    binding: ViewDataBinding,
    onItemClick: (T) -> Unit
) : RecyclerView.ViewHolder(binding.root) {

    private var item: T? = null

    init {
        binding.root.setOnClickListener {
            item?.let {
                onItemClick(it)
            }
        }
    }

    open fun bindData(item: T) {
        this.item = item
    }
}
