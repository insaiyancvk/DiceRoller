package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{   //Whenever the button is clicked, it calls the function rollDice()
            //Toast.makeText(this,"Button Clicked!", Toast.LENGTH_SHORT).show()  //That's how you make a toast
            rollDice()
        }
    }

    private fun rollDice() {    // This function changes the text output on the screen
        val diceImage: ImageView = findViewById(R.id.dice_image)   // this is used to change the text output variable in activity_main.xml
        val randomInt = Random().nextInt(6) + 1   // this takes care of generating a random integer
        val drawableResource = when(randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)
    }
}