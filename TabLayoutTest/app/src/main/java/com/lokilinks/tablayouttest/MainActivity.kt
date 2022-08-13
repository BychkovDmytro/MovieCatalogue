package com.lokilinks.tablayouttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.lokilinks.tablayouttest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val model: MainViewModel by viewModels()



    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().replace(R.id.holder, MainFragment.newInstance()).commit()


    }


}