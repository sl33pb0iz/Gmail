package com.example.gmail

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class Email(
    val name: String,
    val time: String,
    val title: String,
    val content: String
)

class CustomAdapter(private val context: Context, private val emails: ArrayList<Email>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    inner class ViewHolder(listItemView: View) : RecyclerView.ViewHolder(listItemView) {
        val avatar: TextView = listItemView.findViewById(R.id.avatar)
        val nameTextView: TextView = listItemView.findViewById(R.id.name)
        val timeTextView: TextView = listItemView.findViewById(R.id.time)
        val titleTextView: TextView = listItemView.findViewById(R.id.title)
        val contentTextView: TextView = listItemView.findViewById(R.id.content)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val emailView = inflater.inflate(R.layout.list_item_layout, parent, false)
        return ViewHolder(emailView)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val email: Email = emails[position]

        val avatar = viewHolder.avatar
        avatar.text = email.name[0].toString()

        val nameTextView = viewHolder.nameTextView
        nameTextView.text = email.name

        val timeTextView = viewHolder.timeTextView
        timeTextView.text = email.time

        val titleTextView = viewHolder.titleTextView
        titleTextView.text = email.title

        val contentTextView = viewHolder.contentTextView
        contentTextView.text = email.content
    }

    override fun getItemCount(): Int {
        return emails.size
    }
}
