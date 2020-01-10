package com.example.submission.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.submission.R
import com.example.submission.Models.LanguageModel
import org.w3c.dom.Text

class DetailActivity : AppCompatActivity() {

    companion object {
        const val LANGUAGE: String = "language"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val language: LanguageModel = intent.getParcelableExtra(LANGUAGE) as LanguageModel

        val tvName: TextView = findViewById(R.id.tv_language_name)
        val tvDetail: TextView = findViewById(R.id.tv_language_detail)
        val tvCreator: TextView = findViewById(R.id.tv_language_creator)
        val tvReleaseYear: TextView = findViewById(R.id.tv_language_release_year)
        val imgLogo: ImageView = findViewById(R.id.img_language_logo)

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "${language.name} Language"
        }

        Glide.with(this)
            .load(language.logo)
            .apply(RequestOptions().override(100, 100))
            .into(imgLogo)
        tvName.text = language.name
        tvDetail.text = language.detail
        tvCreator.text = language.creator
        tvReleaseYear.text = language.release.toString()
    }

}
