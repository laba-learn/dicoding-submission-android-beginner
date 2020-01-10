package com.example.submission.Activities

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.example.submission.R
import java.lang.Exception


class AboutActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val btnContact: Button = findViewById(R.id.btn_contact)
        btnContact.setOnClickListener(this)

        if (supportActionBar != null) {
            (supportActionBar as ActionBar).title = "About Owner"
        }
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_contact -> {
                try {
                    val email = getString(R.string.about_owner_email)
                    val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:$email"))
                    startActivity(intent)
                } catch (e: Exception) {
                    Toast.makeText(this, "Sorry... you aren't have email apps", Toast.LENGTH_SHORT).show()
                    e.printStackTrace()
                }
            }
        }
    }
}
