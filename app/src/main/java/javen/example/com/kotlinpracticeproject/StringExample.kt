package javen.example.com.kotlinpracticeproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class StringExample : AppCompatActivity() {
    val string: String = "HelloWorld"
    val fromChars: String = String(charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd'))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showStringEqual()
        showIntString()
        showQuotationMarkString()
        showStringWithDollarMark()
        showThreeQuotationMark()
    }

    /**
     * 三个引号，内部转义无效
     */
    private fun showThreeQuotationMark() {
        val rawString: String = """
            \t
            \n
    \\\\\\$$$ salary
        """
        println(rawString)  //原样输出
        println(rawString.length)  //44
    }

    private fun showStringWithDollarMark() {
        val salary: Int = 1000
        println("\$salary")   //$salary
    }

    private fun showQuotationMarkString() {
        val sayHello: String = "Hello \"Xi Da Da\""
        println(sayHello) //Hello "Xi Da Da"
    }

    private fun showIntString() {
        val arg1: Int = 0
        val arg2: Int = 1
        println("" + arg1 + " + " + arg2 + " = " + (arg1 + arg2))  //0 + 1 = 1
        println("$arg1 + $arg2 = ${arg1 + arg2}")  //0 + 1 = 1
    }

    private fun showStringEqual() {
        println(string == fromChars)  //true
        println(string === fromChars)  //false
        println("接下来我们要输出:" + string)  //接下来我们要输出:HelloWorld
    }


}
