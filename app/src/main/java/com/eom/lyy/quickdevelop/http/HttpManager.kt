package com.eom.lyy.quickdevelop.http

import com.eom.lyy.quickdevelop.BuildConfig
import okhttp3.OkHttpClient
import retrofit2.Retrofit

/**
 *Date:2019/2/13
 *Author:kunkun.wang
 *Des:http的管理类 单例模式
 **/
object HttpManager {

    init {
        Retrofit.Builder()
            .baseUrl(HttpConstant.BASEURL)
    }

    fun request() {

    }

    fun initClient(): OkHttpClient {
        OkHttpClient.Builder()
    }
}