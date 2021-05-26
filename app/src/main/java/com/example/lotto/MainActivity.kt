package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import java.util.*
import kotlin.collections.ArrayList


fun getRandomLottoNumber() : Int{
    return Random().nextInt(45)+1
}
fun getRandomLottoNumbers() : MutableList<Int>{
    val lottoNumbers = mutableListOf<Int>()

    while (true){
        var number: Int = getRandomLottoNumber()
        var flag_existing: Int = 0

        if(lottoNumbers.contains(number)){
            //flag_existing=1
            continue

   }
       /* if(flag_existing.equals(1))
            continue
        else*/
        lottoNumbers.add(number)
        if(lottoNumbers.size >= 6)
            break;
        //lottoNumbers.add(getRandomLottoNumber())
    }
    return lottoNumbers
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardRandom = findViewById<CardView>(R.id.randomCard)
        cardRandom.setOnClickListener {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putIntegerArrayListExtra("result", ArrayList(getRandomLottoNumbers()))
            startActivity(intent)
        }

        val cardConstell = findViewById<CardView>(R.id.ConstellationCard)
        cardConstell.setOnClickListener {
            startActivity(Intent(this, ConstellationActivity::class.java))
        }

        val cardName = findViewById<CardView>(R.id.nameCard)
        cardName.setOnClickListener {
            startActivity(Intent(this, NameActivity::class.java))
        }

        /*findViewById<CardView>(R.id.randomCard).setOnClickListener {
            startActivity(Intent(this, ResultActivity::class.java))
        }


        findViewById<CardView>(R.id.ConstellationCard).setOnClickListener {
            startActivity(Intent(this, ConstellationActivity::class.java))
        }

        findViewById<CardView>(R.id.nameCard).setOnClickListener {
            startActivity(Intent(this, NameActivity::class.java))
        }*/
    }
}