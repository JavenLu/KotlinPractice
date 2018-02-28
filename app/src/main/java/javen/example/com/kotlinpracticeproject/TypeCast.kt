package javen.example.com.kotlinpracticeproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

/**
 * Created by Javen on 28/02/2018.
 */
class TypeCast : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val parent: Parent = Parent()
        val child: Child? = parent as? Child

        println(child)   // null

    }
}