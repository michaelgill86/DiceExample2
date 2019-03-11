package com.codinginflow.diceexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;
public class MainActivity extends AppCompatActivity {
    private ImageView imageViewDice;
    private ImageView imageViewDiceTwo;
    private Random rng = new Random();
    int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDiceTwo = findViewById(R.id.image_view_dice_two);
        imageViewDice.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                rollDice();
                rollDice2();
            }
        });
    }

    private void rollDice() {
        randomNumber = rng.nextInt(6) + 1;
        switch (randomNumber) {
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                break;
        }
    }
    private void rollDice2 () {
        randomNumber = rng.nextInt(6) + 1;

        switch (randomNumber) {
            case 1:
                imageViewDiceTwo.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDiceTwo.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDiceTwo.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDiceTwo.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDiceTwo.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDiceTwo.setImageResource(R.drawable.dice6);
                break;
        }
    }
}
