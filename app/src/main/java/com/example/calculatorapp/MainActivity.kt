package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnResult = findViewById<Button>(R.id.parent)
        val etEnterNumber1 = findViewById<EditText>(R.id.etNumber1)
        val etEnterNumber2 = findViewById<EditText>(R.id.etNumber2)
        val btnAddition = findViewById<Button>(R.id.btnAdd)
        val btnSubtraction = findViewById<Button>(R.id.btnSub)
        val btnMultiplication = findViewById<Button>(R.id.btnMult)
        val btnModulus = findViewById<Button>(R.id.btnMod)
        val tvResults = findViewById<TextView>(R.id.btnResult)

        btnAddition.setOnClickListener {
            if (etEnterNumber1.text.toString().equals("") || etEnterNumber2.text.toString()
                    .equals("")
            ) {


                Toast.makeText(baseContext, "EnterNumber", Toast.LENGTH_LONG).show()
            } else {

                val num1 = etEnterNumber1.text.toString().toInt()
                val num2 = etEnterNumber2.text.toString().toInt()
                val add = num1 + num2
                tvResults.text = ("Result $add")
            }



            btnSubtraction.setOnClickListener {

                if (etEnterNumber1.text.toString().equals("") || etEnterNumber2.text.toString()
                        .equals("")
                ) {

                    Toast.makeText(baseContext, "EnterNumber", Toast.LENGTH_LONG).show()
                } else {
                    val num1 = etEnterNumber1.text.toString().toInt()
                    val num2 = etEnterNumber2.text.toString().toInt()
                    val num3 = num1 - num2
                    tvResults.text = ("Result $num3")
                }


                btnMultiplication.setOnClickListener {
                    if (etEnterNumber1.text.toString().equals("") || etEnterNumber2.text.toString()
                            .equals("")
                    ) {

                        Toast.makeText(baseContext, "EnterNumber", Toast.LENGTH_LONG).show()
                    } else {
                        val num1 = etEnterNumber1.text.toString().toInt()
                        val num2 = etEnterNumber2.text.toString().toInt()
                        val num3 = num1 * num2
                        tvResults.text = ("Result $num3")
                    }
                    btnModulus.setOnClickListener {
                        if (etEnterNumber1.text.toString()
                                .equals("") || etEnterNumber2.text.toString()
                                .equals("")
                        ) {
                            Toast.makeText(baseContext, "EnterNumber", Toast.LENGTH_LONG).show()
                        } else {
                            val num1 = etEnterNumber1.text.toString().toInt()
                            val num2 = etEnterNumber2.text.toString().toInt()
                            val num3 = num1 % num2
                            tvResults.text = ("Result $num3")
                        }
                    }
                }
            }
        }
    }
}