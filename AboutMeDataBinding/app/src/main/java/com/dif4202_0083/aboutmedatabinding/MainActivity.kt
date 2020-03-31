package com.dif4202_0083.aboutmedatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.dif4202_0083.aboutmedatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.bEdit.visibility = View.GONE
        binding.tvNickName.visibility = View.GONE

        binding.bDeskripsi.setOnClickListener {
            prosesNama(it)
            /*binding.apply {
                val nama = binding.etNick.text.toString()
                binding.tvNickName.text = "Nick Name Anda : $nama"
                binding.bEdit.visibility = View.VISIBLE
                binding.tvNickName.visibility = View.VISIBLE
                binding.bDeskripsi.visibility = View.GONE
                binding.etNick.visibility = View.GONE
            }*/
        }
        binding.bEdit.setOnClickListener {
            editNama(it)
        }
    }

    fun prosesNama(view: View){
        val nama = binding.etNick.text.toString()
        val person: Person = Person(nama,"Ini Adalah Deskripsi Diri Saya Sebagai Programmer")
        binding.dataNick = person
        binding.bEdit.visibility = View.VISIBLE
        binding.tvNickName.visibility = View.VISIBLE
        binding.bDeskripsi.visibility = View.GONE
        binding.etNick.visibility = View.GONE
        binding.deskScroll.visibility = View.VISIBLE
    }

    fun editNama(view: View){
        binding.bEdit.visibility = View.GONE
        binding.tvNickName.visibility = View.GONE
        binding.bDeskripsi.visibility = View.VISIBLE
        binding.etNick.visibility = View.VISIBLE
        binding.deskScroll.visibility = View.GONE
    }
}
