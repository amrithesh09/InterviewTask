package com.example.myapplication1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    
    lateinit var binding : ActivityMainBinding
    private var dataAdapter: DataAdapter? = null
    private val dataList: ArrayList<DataModel> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        for (i in 1..10) {
            dataList.add(DataModel("Name " + i, "Description " + i))
        }
        binding.rvDataList.layoutManager = LinearLayoutManager(this)
        dataAdapter = DataAdapter(dataList)
        binding.rvDataList.adapter = dataAdapter

    }
}