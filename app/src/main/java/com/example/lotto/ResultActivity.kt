package com.example.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class ResultActivity : AppCompatActivity() {
   // val lottoImageStartId = R.drawable.ball_01

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val result = intent.getIntegerArrayListExtra("result")
        val strConstellation = intent.getStringExtra("constellation")

        val result_sorted = result?.let { result.sortedBy { it } }
        /*result?.let {
            updateLottoBallImages(result.sortedBy { it })
        }*/
        strConstellation?.let {
            val resultLabel = findViewById<TextView>(R.id.resultLabel)
            resultLabel.text = "${strConstellation}의 ${SimpleDateFormat("yyyy년 MM월 dd일").format(Date())} " +
                    "로또 번호입니다"
        }
       //val result_sorted = result?.sorted()
        //updateLottoBallImages(result_sorted)

        val lottoImageStartId = R.drawable.ball_01 //2131165279
       // val lottoImagetId2 = R.drawable.ball_02
       // val lottoImageId3 = R.drawable.ball_03
        val imageViewB1 = findViewById<ImageView>(R.id.imageView3)
        val imageViewB2 = findViewById<ImageView>(R.id.imageView4)
        val imageViewB3 = findViewById<ImageView>(R.id.imageView5)
        val imageViewB4 = findViewById<ImageView>(R.id.imageView6)
        val imageViewB5 = findViewById<ImageView>(R.id.imageView7)
        val imageViewB6 = findViewById<ImageView>(R.id.imageView8)

        imageViewB1.setImageResource(lottoImageStartId + result_sorted!![0] -1)
        imageViewB2.setImageResource(lottoImageStartId + result_sorted[1] -1)
        imageViewB3.setImageResource(lottoImageStartId + result_sorted[2] -1)
        imageViewB4.setImageResource(lottoImageStartId + result_sorted[3] -1)
        imageViewB5.setImageResource(lottoImageStartId + result_sorted[4] -1)
        imageViewB6.setImageResource(lottoImageStartId + result_sorted[5] -1)

    }
    /*private fun updateLottoBallImages(result_sorted : List<Int>){
        val lottoImageStartId = R.drawable.ball_01 //2131165279

        val imageViewB1 = findViewById<ImageView>(R.id.imageView3)
        val imageViewB2 = findViewById<ImageView>(R.id.imageView4)
        val imageViewB3 = findViewById<ImageView>(R.id.imageView5)
        val imageViewB4 = findViewById<ImageView>(R.id.imageView6)
        val imageViewB5 = findViewById<ImageView>(R.id.imageView7)
        val imageViewB6 = findViewById<ImageView>(R.id.imageView8)

        imageViewB1.setImageResource(lottoImageStartId + result_sorted!![0] -1)
        imageViewB2.setImageResource(lottoImageStartId + result_sorted[1] -1)
        imageViewB3.setImageResource(lottoImageStartId + result_sorted[2] -1)
        imageViewB4.setImageResource(lottoImageStartId + result_sorted[3] -1)
        imageViewB5.setImageResource(lottoImageStartId + result_sorted[4] -1)
        imageViewB6.setImageResource(lottoImageStartId + result_sorted[5] -1)
    }*/
}