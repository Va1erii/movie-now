package com.vpopov.movienow.feature.movie.list.imp.data

import com.vpopov.movienow.feature.movie.list.api.model.Movie
import kotlinx.coroutines.flow.Flow

internal interface MovieRepository {
    fun getPopularMovies(): Flow<List<Movie>>

    suspend fun getMovieById(id: String): Movie?
}
