package com.example.a5_lab.client

import retrofit2.Call
import retrofit2.http.GET

interface PostApi {
    @GET("/posts")
    fun getPosts(): Call<List<Post>>
}