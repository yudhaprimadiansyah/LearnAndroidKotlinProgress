package com.dif4202_0083.miwokdata_jurnal09

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import retrofit2.Callback


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ApiMain().services.getSemuaData().enqueue(object : Callback<ListMiwokData>{

        })


        setContentView(R.layout.activity_main)
    }
}
