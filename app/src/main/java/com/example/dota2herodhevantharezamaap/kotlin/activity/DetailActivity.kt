package com.example.dota2herodhevantharezamaap.kotlin.activity

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.dota2herodhevantharezamaap.R
import com.example.dota2herodhevantharezamaap.kotlin.model.Hero
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val hero = intent.getParcelableExtra<Hero>("HERO")

        name.text = hero.name
        detail.text = hero.detail
        Glide.with(this)
                .load(hero.image)
                .into(image)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}
