package com.vpopov.movienow

import android.app.Application
import com.vpopov.movienow.di.AppComponent
import com.vpopov.movienow.di.DaggerAppComponent

class MovieNowApp : Application() {
    lateinit var component: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.factory()
            .create(this)
    }
}
