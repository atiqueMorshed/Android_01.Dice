package com.atiquemorshed.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.lang.reflect.Array;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.button_Roll);

        final ImageView leftDice = findViewById(R.id.image_left);
        final ImageView rightDice = findViewById(R.id.image_right);

        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dice", "Button Clicked.");

                Random randomNumberGenerator = new Random();
                int number1 = randomNumberGenerator.nextInt(6);
                int number2 = randomNumberGenerator.nextInt(6);

                leftDice.setImageResource(diceArray[number1]);
                rightDice.setImageResource(diceArray[number2]);

                Log.d("Dice", "The Random Number is: "+ number1);

            }
        });
    }
}
