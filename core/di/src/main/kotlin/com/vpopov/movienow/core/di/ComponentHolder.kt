package com.vpopov.movienow.core.di

interface ComponentHolder<C : BaseApi, D : BaseDependencies> {
    fun init(dependencies: D)

    fun get(): C

    fun reset()
}

interface BaseApi

interface BaseDependencies