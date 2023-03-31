package com.android.recycleviewchapter3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.recycleviewchapter3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listStudentData = arrayListOf(
            ListStudent("Reno", 19, R.drawable.img),
            ListStudent("Oren", 20, R.drawable.img),
            ListStudent("Enor", 21, R.drawable.img_1),
            ListStudent("Nore", 20, R.drawable.img_1),
            ListStudent("Oyen", 20, R.drawable.img_1),
            ListStudent("ara ara", 20, R.drawable.img_1),
            ListStudent("Ben", 20, R.drawable.img_1),
            ListStudent("Squit", 20, R.drawable.img_1),
            ListStudent("Rey", 20, R.drawable.img_1),
            ListStudent("Yeno", 19, R.drawable.img_1)

        )

        val adapterStudent = StudentAdapter(listStudentData)

        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        val gl = GridLayout(this)
        binding.rvStudent.layoutManager = lm
        binding.rvStudent.adapter = adapterStudent

    }
}