package com.example.moviestack.ui.persondetail.info.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.moviestack.R
import com.example.moviestack.pojo.PersonImages
import com.example.moviestack.databinding.ImagesDataBinding
import com.example.moviestack.pojo.ImagesDeatail

class PersonImageAdapter(private val list: PersonImages) : RecyclerView.Adapter<PersonImageAdapter.VideosViewHolder>() {

    inner class VideosViewHolder(val imagesDataBinding: ImagesDataBinding) : RecyclerView.ViewHolder(imagesDataBinding.root) {

        fun bind(
            result: PersonImages,
            position: Int
        ) {
            this.imagesDataBinding.images = result
            this.imagesDataBinding.url = result.profiles[position].getImages()
            this.imagesDataBinding.position = position
            this.imagesDataBinding.executePendingBindings()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideosViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val imagesDataBinding: ImagesDataBinding = DataBindingUtil.inflate(layoutInflater, R.layout.images,parent,false)
        return VideosViewHolder(imagesDataBinding)
    }

    override fun getItemCount(): Int {
        return list.profiles.size
    }

    override fun onBindViewHolder(holder: VideosViewHolder, position: Int) {
        holder.bind(list,position)
    }
}