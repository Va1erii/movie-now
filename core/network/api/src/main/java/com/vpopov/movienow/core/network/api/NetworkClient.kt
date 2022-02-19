package com.vpopov.movienow.core.network.api

interface NetworkClient {
    fun <T> buildService(clazz: Class<T>): T
}
