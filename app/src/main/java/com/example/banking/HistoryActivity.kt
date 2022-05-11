package com.example.banking


import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HistoryActivity : AppCompatActivity() {
    private lateinit var helper: MyDBHelper
    private lateinit var db : SQLiteDatabase
    lateinit var recyclerView: RecyclerView
    lateinit var layoutManager: RecyclerView.LayoutManager
    lateinit var recyclerAdapter:HistoryAdapter
    private lateinit var mapp:HashMap<Int,Customer>

    private lateinit var adapter:MyAdapter

    private lateinit var rs: Cursor
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_history)
        recyclerView.layoutManager=LinearLayoutManager(this)


    }
    private fun fetchData(){

    }
}
