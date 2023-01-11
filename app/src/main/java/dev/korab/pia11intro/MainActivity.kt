package dev.korab.pia11intro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var myNumber = 0


    lateinit var myText : TextView

    //Detta hade även kunnat göras såsom:
    //var myText : TextView? = null
    //Man måste då utryckligen säga att denna har värdet null samt måste man vidare bekräfta varje gång denne används i koden.


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myText = findViewById<TextView>(R.id.fancyText)

        myText.text = "Hej"

        findViewById<Button>(R.id.fancyButton).setOnClickListener {

            myNumber += 1

            doCalc(1)

        }

        findViewById<Button>(R.id.minusButton).setOnClickListener {
            doCalc(-1)
        }

        findViewById<Button>(R.id.plusButton).setOnClickListener {
            doCalc(1)
        }

        findViewById<Button>(R.id.resetButton).setOnClickListener {
            doCalc(0)
        }

    }

    fun doCalc(calcNumber : Int) {

        if(calcNumber == 0) {
            myNumber = 0
        }

        myNumber += calcNumber

        if(myNumber < 0 ) {
            myNumber = 0
        }

        myText.text = myNumber.toString()

    }

}