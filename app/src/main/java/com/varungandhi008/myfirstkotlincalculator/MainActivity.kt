package com.varungandhi008.myfirstkotlincalculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun sum(view:View)
    {
         val a:Float
         val b:Float
      if ( !number1.text.toString().equals("") && !number2.text.toString().equals("")) {
           a = number1.text.toString().toFloat()
           b = number2.text.toString().toFloat()
      }
        else
      {
           a = 0.0f
           b = 0.0f
      }
        val result = a+b
        textView.text = result.toString()
    }


    fun sub(view:View)
    {
        val a:Float
        val b:Float
        if ( !number1.text.toString().equals("") && !number2.text.toString().equals("")) {
            a = number1.text.toString().toFloat()
            b = number2.text.toString().toFloat()
        }
        else
        {
            a = 0.0f
            b = 0.0f
        }
        val result = a-b
        textView.text = result.toString()
    }


    fun mul(view:View)
    {
        val a:Float
        val b:Float
        if ( !number1.text.toString().equals("") && !number2.text.toString().equals("")) {
            a = number1.text.toString().toFloat()
            b = number2.text.toString().toFloat()
        }
        else
        {
            a = 0.0f
            b = 0.0f
        }
        val result = a*b
        textView.text = result.toString()
    }


    fun div(view:View)
    {
        val a:Float
        val b:Float
        if ( !number1.text.toString().equals("") && !number2.text.toString().equals("")) {
            a = number1.text.toString().toFloat()
            b = number2.text.toString().toFloat()
        }
        else
        {
            a = 0.0f
            b = 0.0f
        }
        val result = a/b
        textView.text = result.toString()
    }
}
