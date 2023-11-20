package com.example.a5_lab

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a4_lab.R
import com.example.a5_lab.client.ApiCall

class MainActivity : AppCompatActivity() {
    lateinit var postsRV: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        postsRV = findViewById(R.id.postsRV)
        postsRV.layoutManager = LinearLayoutManager(this)
        val postRVAdapter = PostRVAdapter(this)
        postsRV.adapter = postRVAdapter

        ApiCall().getPosts(this) {posts ->
            postRVAdapter.updateList(posts)
        }
    }
}