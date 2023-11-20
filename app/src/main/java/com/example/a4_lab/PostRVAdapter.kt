package com.example.a4_lab

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a4_lab.client.Post

class PostRVAdapter(
    val context: Context
) :
    RecyclerView.Adapter<PostRVAdapter.ViewHolder>() {

    private val allPosts = ArrayList<Post>()

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val noteTV = itemView.findViewById<TextView>(R.id.idTVPost)
        val dateTV = itemView.findViewById<TextView>(R.id.idTVDate)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.post_rv_item,
            parent, false
        )
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.noteTV.setText(allPosts.get(position).title)
        holder.dateTV.setText("Last Updated : "+allPosts.get(position).body)
    }

    override fun getItemCount(): Int {
        return allPosts.size
    }

    fun updateList(newList: List<Post>) {
        allPosts.clear()
        allPosts.addAll(newList)
        notifyDataSetChanged()
    }
}