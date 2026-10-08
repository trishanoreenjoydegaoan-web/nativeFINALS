package com.example.iconnect

import retrofit2.http.GET

interface ApiService{
    @GET("posts/2")
    suspend fun getPost(): Post
}
