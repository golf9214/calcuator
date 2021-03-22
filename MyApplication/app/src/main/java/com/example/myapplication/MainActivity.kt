package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        one.setOnClickListener{
            if(rst.text.toString()=="0") {
            rst.setText("1")
            }else{
                var str = rst.text.toString().plus(1)
                rst.setText(str)
            }
        }


        two.setOnClickListener{
            if(rst.text.toString()=="0") {
                rst.setText("2")
            }else{
                var str = rst.text.toString().plus(2)
                rst.setText(str)
            }
        }
        three.setOnClickListener{
            if(rst.text.toString()=="0") {
                rst.setText("3")
            }else{
                var str = rst.text.toString().plus(3)
                rst.setText(str)
            }
        }
        four.setOnClickListener{
            if(rst.text.toString()=="0") {
                rst.setText("4")
            }else{
                var str = rst.text.toString().plus(4)
                rst.setText(str)
            }
        }
        five.setOnClickListener{
            if(rst.text.toString()=="0") {
                rst.setText("5")
            }else{
                var str = rst.text.toString().plus(5)
                rst.setText(str)
            }
        }
        six.setOnClickListener{
            if(rst.text.toString()=="0") {
                rst.setText("6")
            }else{
                var str = rst.text.toString().plus(6)
                rst.setText(str)
            }
        }
        seven.setOnClickListener{
            if(rst.text.toString()=="0") {
                rst.setText("7")
            }else{
                var str = rst.text.toString().plus(7)
                rst.setText(str)
            }
        }
        eight.setOnClickListener{
            if(rst.text.toString()=="0") {
                rst.setText("8")
            }else{
                var str = rst.text.toString().plus(8)
                rst.setText(str)
            }
        }
        nine.setOnClickListener{
            if(rst.text.toString()=="0") {
                rst.setText("9")
            }else{
                var str = rst.text.toString().plus(9)
                rst.setText(str)
            }
        }
        zero.setOnClickListener{
            if(rst.text.toString()=="0") {
                rst.setText("0")
            }else{
                var str = rst.text.toString().plus(0)
                rst.setText(str)
            }
        }
        cancel.setOnClickListener {
            rst.setText("0")
        }

        del.setOnClickListener {
            if (rst.text.toString().length<=1) {
                rst.setText("0")
            }else if (rst.text.isNotEmpty()){
                rst.text=rst.text.dropLast(1)
            }
        }







    }
}


