package com.dif4202_0083.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var gambarDadu: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.btn_roll)
        gambarDadu = findViewById(R.id.gambar_dadu)
        gambarDadu.setImageResource(R.drawable.dice_6)
        //val textNilai: TextView = findViewById(R.id.text_nilai)
        //textNilai.text = (0).toString()
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    fun rollDice(){
        val nilai = (1..6).random()
        //    textNilai.text = nilai
        val gambar = when(nilai){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        gambarDadu.setImageResource(gambar)
        Toast.makeText(this, "Dadu dikocok, Hasilnya : $nilai", Toast.LENGTH_SHORT).show()
    }
}
