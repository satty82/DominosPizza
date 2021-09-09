package com.example.dominospizza

import ViewModel.DataViewModel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.get

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        callIt()


    }

    private fun callIt() {

        val data : DataViewModel = ViewModelProviders.of(this).get()

        data.getAllDet().observe(this@MainActivity, Observer {
            Log.e("SATTY", it.toString())

        })
}
    }