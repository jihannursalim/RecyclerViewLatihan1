package com.example.recyclerviewonzoom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewonzoom.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listStudentData = arrayListOf(
            ListStudent("Jihan", 20),
            ListStudent("Ze", 21),
            ListStudent("Dian", 20),
            ListStudent("Dheva", 23)
        )

        //Membuat Adapter
        val adapterStudent = StudentAdapter(listStudentData)

        //Mengatur tata letak dari recyclerview
        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvStudent.layoutManager = lm
        binding.rvStudent.adapter = adapterStudent
    }
}