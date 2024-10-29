package com.example.email.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.email.R
import com.example.email.model.EmailModel

class EmailAdapter(private val newslist : ArrayList<EmailModel>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.email_items,parent,false)
        return EmailViewHolder(view)
    }
    override fun getItemCount() = newslist.size

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val currentItem = newslist[position]
        holder.tvSender.text = currentItem.sender
        holder.avatar.setImageResource(currentItem.avatar)
        holder.tvTime.text = currentItem.time
        holder.tvBody.text = currentItem.body
    }
    class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val tvSender: TextView = itemView.findViewById(R.id.Sender)
        val tvBody : TextView = itemView.findViewById(R.id.emailText)
        val tvTime : TextView = itemView.findViewById(R.id.time)
        val avatar : ImageView = itemView.findViewById(R.id.avatar)
    }
}