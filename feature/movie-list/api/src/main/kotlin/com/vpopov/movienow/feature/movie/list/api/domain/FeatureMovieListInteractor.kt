package com.vpopov.movienow.feature.movie.list.api.domain

import com.vpopov.movienow.feature.movie.list.api.model.Movie
import kotlinx.coroutines.flow.Flow

interface FeatureMovieListInteractor {
    fun getPopularMovies(): Flow<List<Movie>>
    suspend fun getMovieById(id: String): Movie?
}
