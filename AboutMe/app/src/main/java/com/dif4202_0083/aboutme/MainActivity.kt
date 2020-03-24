package com.dif4202_0083.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonDone: Button = findViewById(R.id.bt_submit)
        val buttonEdit: Button = findViewById(R.id.bt_edit)
        val textNick: TextView = findViewById(R.id.tv_nickname)
        val editNick: EditText = findViewById<EditText>(R.id.et_nick)

        buttonDone.setOnClickListener {
            buttonDone.visibility = View.GONE
            editNick.visibility = View.GONE
            buttonEdit.visibility = View.VISIBLE
            textNick.text = editNick.text.toString()
            textNick.visibility = View.VISIBLE
            println(editNick.text.toString())
        }

        buttonEdit.setOnClickListener {
            updateNickName(it)

        }


    }

    private fun updateNickName(view: View){
        val editNick = findViewById<EditText>(R.id.et_nick)
        val buttonDone = findViewById<Button>(R.id.bt_submit)
        val textNick = findViewById<TextView>(R.id.tv_nickname)
        textNick.visibility = View.GONE
        buttonDone.visibility = View.VISIBLE
        editNick.visibility = View.VISIBLE

        view.visibility = View.GONE
    }
}
