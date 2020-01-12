package com.example.moviestack.api.repo.trending

import com.example.moviestack.api.pojo.MovieList
import com.example.moviestack.api.pojo.SmallItemList
import io.reactivex.Observable

interface TrendingRepositoryI {
    fun getSmallItemsList(type : SmallItemList.Type) : Observable<SmallItemList>

    fun getMoviesList(id : String, type : SmallItemList.Type) : Observable<MovieList>
}