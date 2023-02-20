package com.example.diceroller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)  //find button by it's id
        rollButton.setOnClickListener {     //onClick event

        Toast.makeText(this, "dé lancer!", Toast.LENGTH_SHORT).show()  //validation button

        //val resultTextView: TextView = findViewById(R.id.textView)  //find TextView by it's id
        //resultTextView.text = "6"  //afficher le text entre ""

        rollDice()  // appel de fct rollDice

        }
    }

    private fun rollDice() {
        val dice = Dice(6)  // appel de class Dice()

        val diceRoll = dice.roll()   // appel de fct roll()  //dice Roller is an Int

        val resultTextView: TextView = findViewById(R.id.textView)  //find TextView by it's id
        resultTextView.text = diceRoll.toString()  //afficher le text String entre ""
    }

}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()   //number random
    }
}
