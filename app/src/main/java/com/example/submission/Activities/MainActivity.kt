package com.example.submission.Activities

import android.content.Intent
import android.os.Bundle
import android.os.Parcelable
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.submission.Adapters.LanguageListAdapter
import com.example.submission.Models.LanguageModel
import com.example.submission.R
import com.example.submission.Stores.LanguageStore
import com.microsoft.appcenter.AppCenter
import com.microsoft.appcenter.analytics.Analytics
import com.microsoft.appcenter.crashes.Crashes


class MainActivity : AppCompatActivity() {

    private lateinit var rvLanguages: RecyclerView
    private var list: ArrayList<LanguageModel> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // add microsoft app center
        AppCenter.start(
            application, "fa0087aa-aff9-4d28-894e-dc8585d160bb",
            Analytics::class.java, Crashes::class.java
        )

        rvLanguages = findViewById(R.id.rv_languages)
        rvLanguages.setHasFixedSize(true)

        list.addAll(LanguageStore.languages)
        showRecyclerLanguagesList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        selectMenu(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun showRecyclerLanguagesList() {
        rvLanguages.layoutManager = LinearLayoutManager(this)
        val listAdapter = LanguageListAdapter(list)
        rvLanguages.adapter = listAdapter

        listAdapter.setOnItemClickCallback(object : LanguageListAdapter.OnItemClickCallback {
            override fun onItemClicked(language: LanguageModel) {
                showLanguageDetail(language)
            }
        })
    }

    private fun showLanguageDetail(language: LanguageModel) {
        val intent = Intent(this@MainActivity, DetailActivity::class.java)
        intent.putExtra(DetailActivity.LANGUAGE, language as Parcelable)
        startActivity(intent)
    }

    private fun selectMenu(selectedMenu: Int) {
        when (selectedMenu) {
            R.id.menu_about -> {
                val intent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
