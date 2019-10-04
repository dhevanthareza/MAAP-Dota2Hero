package com.example.dota2herodhevantharezamaap.kotlin.activity

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dota2herodhevantharezamaap.R
import com.example.dota2herodhevantharezamaap.kotlin.HeroesData
import com.example.dota2herodhevantharezamaap.kotlin.adapter.HeroAdapter
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.intentFor

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showRecylerview()
    }

    private fun showRecylerview() {
        val listHero = HeroesData.getListData()

        rv_heroes.setHasFixedSize(true)
        rv_heroes.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        rv_heroes.adapter = HeroAdapter(this, listHero)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.manu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.toProfile -> startActivity(intentFor<ProfilActivity>())
        }
        return super.onOptionsItemSelected(item)
    }
}
