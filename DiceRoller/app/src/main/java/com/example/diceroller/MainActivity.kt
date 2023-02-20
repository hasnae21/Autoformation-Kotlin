package com.example.diceroller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)  //find button by it's id
        rollButton.setOnClickListener {     //onClick event

        Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT).show()  //validation button

        //val resultTextView: TextView = findViewById(R.id.textView)  //find TextView by it's id
        //resultTextView.text = "6"  //afficher le text entre ""

        rollDice()  // appel de fct rollDice

        }
    }

    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {

        ///////////  Dice number 1

        // Create first Dice object with 6 sides and roll it
        val dice = Dice(6)  // appel 1 de class Dice()
        val diceRoll = dice.roll()   // appel 1 de fct roll()  //dice Roller is an Int

        // Update the screen with the dice roll 1
        val resultTextView: TextView = findViewById(R.id.textView)  //find TextView by it's id textView
        resultTextView.text = diceRoll.toString()  // afficher le text String entre ""


        //////////  Dice number 2

        val dice1 = Dice(6)
        val diceRoll1 = dice.roll()

        val resultTextView1: TextView = findViewById(R.id.textView1)
        resultTextView1.text = diceRoll1.toString()

    }

}

class Dice(private val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()   //number random
    }
}