package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var blogAdapter:BlogRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()
        addDataSet()
    }
    private  fun addDataSet(){
        val data=DataSource.createDataSet()
        blogAdapter.submitList(data)
    }
    private fun initRecyclerView(){
       /* recycler_view.layoutManager=LinearLayoutManager(this)
        blogAdapter=BlogRecyclerAdapter()
        recycler_view.adapter=blogAdapter*/


        recycler_view.apply {
            layoutManager=LinearLayoutManager(this@MainActivity)
            val topspacingdecoration=TopSpacing(30)
            addItemDecoration(topspacingdecoration)
            blogAdapter=BlogRecyclerAdapter()
            adapter=blogAdapter
        }
    }
}