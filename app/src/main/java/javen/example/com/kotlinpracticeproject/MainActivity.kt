package javen.example.com.kotlinpracticeproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun sum2(a: Int, b: Int) = a + b

    public fun sum3(a: Int, b: Int): Int = a + b

    fun printSum(a: Int, b: Int): Unit {
        println(a + b)
    }

    public fun printSum1(a: Int, b: Int) {
        println(a + b)
    }




}
