package com.cb.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.ComponentActivity
import coil.load


class DressActivity : ComponentActivity() {

    private val imageOne = "https://ae01.alicdn.com/kf/S32a97ed780e74e74a7f202fa4492242fO/African-Dresses-For-Women-Dashiki-Long-Maxi-Dress-2023-Spring-Summer-Dress-Ladies-Traditional-African-Clothing.jpg"
    private val imageTwo = "https://www.jaipuriadaah.com/cdn/shop/files/DSC_6792copy_600x.jpg?v=1692879766"
    private val imageThree = "https://rukminim2.flixcart.com/image/850/1000/xif0q/dress/a/j/1/-original-imagnhgnbvvccukh.jpeg?q=90&crop=false"
    private val brand = "https://fashionunited.com/r/fit=cover,format=auto,gravity=center,quality=70,width=1164/https://fashionunited.com/img/upload/2023/04/07/pullandbear-5-ii3awg2w-2023-04-07.jpeg"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dress_screen)

        val rentButton = findViewById<Button>(R.id.rent)
        val showMoreButton = findViewById<Button>(R.id.show_more)
        val imageImage = findViewById<ImageView>(R.id.main_image)
        val primaryImageSmall = findViewById<ImageView>(R.id.primary_image_small)
        val secondaryImageSmall = findViewById<ImageView>(R.id.secondary_image_small)
        val brandImage = findViewById<ImageView>(R.id.brand_image)

        imageImage.load(imageOne) {
            crossfade(3000)
        }

        primaryImageSmall.load(imageTwo) {
            crossfade(5000)
        }

        secondaryImageSmall.load(imageThree) {
            crossfade(2000)
        }
        brandImage.load(brand) {
            crossfade(7000)
        }


        rentButton.setOnClickListener {
            Toast.makeText(this, "Ready rent", Toast.LENGTH_SHORT).show()
        }

        showMoreButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(Uri.parse("https://www.zara.com/mx/"))
            startActivity(intent)
        }

        showMoreButton.setOnLongClickListener {
            Toast.makeText(this, "Show more pressed for a while", Toast.LENGTH_SHORT).show()
            true
        }


    }



    override fun onRestart() {
        super.onRestart()
        println("onRestart")
    }

    override fun onResume() {
        super.onResume()
        println("onResume")
    }

    override fun onPause() {
        super.onPause()
        println("onPause")
    }

    override fun onStart() {
        super.onStart()
        println("onPause")
    }

    override fun onStop() {
        super.onStop()
        println("onPause")
    }
}