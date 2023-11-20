package com.example.a4_lab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a4_lab.client.ApiCall
import com.example.a4_lab.client.Post
import com.example.a4_lab.client.PostApi
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

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