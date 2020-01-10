package com.example.submission.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.submission.Models.LanguageModel
import com.example.submission.R

class LanguageListAdapter(private val languages: ArrayList<LanguageModel>) :
    RecyclerView.Adapter<LanguageListAdapter.ViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    interface OnItemClickCallback {
        fun onItemClicked(language: LanguageModel)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgLogo: ImageView = itemView.findViewById(R.id.img_item_logo)
        var tvName: TextView = itemView.findViewById(R.id.tv_language_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_language_detail)
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.adapter_language_list, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return languages.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val language = languages[position]
        Glide.with(holder.itemView.context)
            .load(language.logo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgLogo)
        holder.tvName.text = language.name
        holder.tvDetail.text = language.detail

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(language)
        }
    }
}