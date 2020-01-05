package com.example.moviestack.ui.dashboard.home.bindingadapter

import android.content.Intent
import androidx.appcompat.widget.AppCompatImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.BindingAdapter
import com.example.moviestack.api.pojo.MovieList
import com.example.moviestack.api.pojo.SmallItemList
import com.example.moviestack.ui.moviedetail.MovieDetailActivity
import com.squareup.picasso.Picasso

object SmallItemOnclick {
    @JvmStatic
    @BindingAdapter("setSmallItemOnclick")
    fun setSmallItemOnclick (layout : ConstraintLayout, result : MovieList.Result?){

        layout.setOnClickListener{
            val intent = Intent(layout.context, MovieDetailActivity::class.java)
            intent.putExtra("id", "${result?.id}")
            intent.putExtra("title", if(result?.title.equals(""))result?.originalTitle else  result?.title)
            layout.context.startActivity(intent)
        }

    }
}