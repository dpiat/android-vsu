package com.example.a5_lab.client

data class Post(
    var userId: Long,
    var id: Long,
    var title: String,
    var body: String
):java.io.Serializable