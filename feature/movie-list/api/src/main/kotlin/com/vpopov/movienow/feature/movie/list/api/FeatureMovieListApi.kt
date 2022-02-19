package com.vpopov.movienow.feature.movie.list.api

import com.vpopov.movienow.core.di.BaseApi
import com.vpopov.movienow.core.navigation.Router

interface FeatureMovieListApi : BaseApi {
    fun router(): Router
}
