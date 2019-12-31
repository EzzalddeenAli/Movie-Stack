package com.example.moviestack.ui.moviedetail.info.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.moviestack.R
import com.example.moviestack.api.pojo.Credits
import com.example.moviestack.api.pojo.MovieInfo
import com.example.moviestack.databinding.CrewDataBinding
import com.example.moviestack.databinding.GenresDataBinding

class CrewAdapter(private val listOfFlags: List<Credits.Crew>) : RecyclerView.Adapter<CrewAdapter.CrewViewHolder>() {

    inner class CrewViewHolder(val crewDataBinding: CrewDataBinding) : RecyclerView.ViewHolder(crewDataBinding.root) {

        fun bind(result: Credits.Crew) {
            this.crewDataBinding.crew = result
            this.crewDataBinding.executePendingBindings()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CrewViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val crewDataBinding: CrewDataBinding = DataBindingUtil.inflate(layoutInflater, R.layout.crew,parent,false)
        return CrewViewHolder(crewDataBinding)
    }

    override fun getItemCount(): Int {
        if(listOfFlags.size>8)
            return 8
        else
            return listOfFlags.size
    }



    override fun onBindViewHolder(holder: CrewViewHolder, position: Int) {
        holder.bind(listOfFlags[position])
    }


}