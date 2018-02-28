package javen.example.com.kotlinpracticeproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by Javen on 28/02/2018.
 */
class NullSafe : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val value: String? = "HelloWorld"
        println(value!!.length)  // !! 表示肯定不为空

        val name: String = getName() ?: return  //三目运算符，表示如果返回的字符串不为空，就返回这个值，否则什么都不反回
        println(name)
        println(name.length)
    }

    fun getName(): String? {
        return null
    }


}
