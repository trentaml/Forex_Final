package com.example.forex

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun usComparison(view: View?) {
        startActivity(Intent(this@MainActivity, USComparison::class.java))
    }

    fun jpComparison(view: View?) {
        startActivity(Intent(this@MainActivity, JPComparison::class.java))
    }

    fun euComparison(view: View?) {
        startActivity(Intent(this@MainActivity, EUComparison::class.java))
    }

    fun ukComparison(view: View?) {
        startActivity(Intent(this@MainActivity, UKComparison::class.java))
    }

    fun nzComparison(view: View?) {
        startActivity(Intent(this@MainActivity, NZComparison::class.java))
    }

    fun caComparison(view: View?) {
        startActivity(Intent(this@MainActivity, CAComparison::class.java))
    }

    fun auComparison(view: View?) {
        startActivity(Intent(this@MainActivity, AUComparison::class.java))
    }

    fun swComparison(view: View?) {
        startActivity(Intent(this@MainActivity, SWComparison::class.java))
    }

}
