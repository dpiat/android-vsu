package com.example.a4_lab.client

import retrofit2.Call
import retrofit2.http.GET

interface PostApi {
    @GET("/posts")
    fun getPosts(): Call<List<Post>>
}