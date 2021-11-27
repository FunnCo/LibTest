package com.funnco.libtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.funnco.images.SimpleImageController
import com.funnco.libtest.databinding.ActivityMainBinding
import com.funnco.toaster.Toaster

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        Toaster.show("Toaster works fine", this)
        setContentView(binding.root)

        binding.recycler.layoutManager = GridLayoutManager(this, 2)
        binding.recycler.adapter = SimpleImageController.getAdapter(Repo.getExamples(this))
    }
}