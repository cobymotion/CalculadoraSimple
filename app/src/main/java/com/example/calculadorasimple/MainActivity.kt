package com.example.calculadorasimple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var edNum1Txt: EditText
    lateinit var edNum2Txt: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edNum1Txt = findViewById(R.id.edNum1)
        edNum2Txt = findViewById(R.id.edNum2)
    }

    fun hacerOperacion(view: View)
    {
        val num1: Int  = edNum1Txt.text.toString().toInt()
        val num2 = edNum2Txt.text.toString().toInt()
        val suma = num1 + num2
        Toast.makeText(this,"El resultado es $suma",Toast.LENGTH_LONG).show()

    }
}