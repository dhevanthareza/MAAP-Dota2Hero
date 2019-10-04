package com.example.dota2herodhevantharezamaap.kotlin.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dota2herodhevantharezamaap.R
import com.example.dota2herodhevantharezamaap.java.MainActivity
import kotlinx.android.synthetic.main.activity_splash_screen.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.sdk27.coroutines.onClick

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        btn_java.onClick {
            startActivity(intentFor<MainActivity>())
        }

        btn_kotlin.onClick {
            startActivity(intentFor<com.example.dota2herodhevantharezamaap.kotlin.activity.MainActivity>())
        }
    }
}
