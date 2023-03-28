package com.example.lesson1_month6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.example.lesson1_month6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Toast.makeText(this, getString(R.string.test), Toast.LENGTH_SHORT).show()


        val list = arrayListOf(
            getString(R.string.ph_1),
            getString(R.string.ph_2),
            getString(R.string.ph_3),
            getString(R.string.ph_4),
            getString(R.string.ph_5)
        )

        with(binding) {
            btnSubm.setOnClickListener {
                list.add(urlEt.text.toString())
                urlEt.setText("")
            }
            btnRandom.setOnClickListener {
                Glide.with(applicationContext).load(list.random()).into(ivRandom)
            }
        }
    }
}