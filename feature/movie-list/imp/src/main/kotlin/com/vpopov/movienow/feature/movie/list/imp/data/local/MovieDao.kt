package com.vpopov.movienow.feature.movie.list.imp.data.local

import com.vpopov.movienow.feature.movie.list.api.model.Movie
import kotlinx.coroutines.flow.Flow

internal interface MovieDao {
    fun getMovies(): Flow<List<Movie>>
}
