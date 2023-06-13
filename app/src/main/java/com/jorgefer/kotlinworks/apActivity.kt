package com.jorgefer.kotlinworks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class apActivity : AppCompatActivity() {

    private  var  categories = listOf(
        TaskCategory.Bussines,
        TaskCategory.Personal,
        TaskCategory.Other
    )

    private lateinit var rvCategories : RecyclerView
    private lateinit var  categoriesAdapter: CategoriesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ap)
        initComponent()
        initUI()
    }


    private fun initComponent() {
        rvCategories = findViewById(R.id.rvCategories)
    }

    private fun initUI() {
        categoriesAdapter = CategoriesAdapter(categories)
        rvCategories.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvCategories.adapter = categoriesAdapter
    }

}