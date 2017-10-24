package com.example.tejasbhoir.rockpapersscissors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import java.util.Random;
import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    private int randNumber = 0;
    //private int rock = 0;
    //private int paper = 1;
    //private int scissor = 2;
    private int winCount = 0;
    private int lossCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setNumbers();
    }

    public void setNumbers() {

        Random rand = new Random();
        randNumber = rand.nextInt(2);
    }

    public void onClickRock (View view) {
        if (randNumber == 2)
        {
            TextView ai_choice = (TextView) findViewById(R.id.AI_choice);
            ai_choice.setText("Scissor");
            Toast.makeText(this,"You Win!", LENGTH_SHORT).show();
            winCount++;
        }
        else if (randNumber == 0)
        {
            TextView ai_choice = (TextView) findViewById(R.id.AI_choice);
            ai_choice.setText("Rock");
            Toast.makeText(this,"Draw!", LENGTH_SHORT).show();
        }
        else
        {
            TextView ai_choice = (TextView) findViewById(R.id.AI_choice);
            ai_choice.setText("Paper");
            Toast.makeText(this,"You Lose!", LENGTH_SHORT).show();
            lossCount++;
        }
        TextView winCounter = (TextView) findViewById(R.id.winCounter);
        TextView lossCounter = (TextView) findViewById(R.id.lossCounter);
        winCounter.setText(winCount + "");
        lossCounter.setText(lossCount + "");
        setNumbers();
    }

    public void onClickPaper (View view) {
        if (randNumber == 0)
        {
            TextView ai_choice = (TextView) findViewById(R.id.AI_choice);
            ai_choice.setText("Rock");
            Toast.makeText(this,"You Win!", LENGTH_SHORT).show();
            winCount++;
        }
        else if (randNumber == 1)
        {
            TextView ai_choice = (TextView) findViewById(R.id.AI_choice);
            ai_choice.setText("Paper");
            Toast.makeText(this,"Draw!", LENGTH_SHORT).show();
        }
        else
        {
            TextView ai_choice = (TextView) findViewById(R.id.AI_choice);
            ai_choice.setText("Scissor");
            Toast.makeText(this,"You Lose!", LENGTH_SHORT).show();
            lossCount++;
        }
        TextView winCounter = (TextView) findViewById(R.id.winCounter);
        TextView lossCounter = (TextView) findViewById(R.id.lossCounter);
        winCounter.setText(winCount + "");
        lossCounter.setText(lossCount + "");
        setNumbers();
    }

    public void onClickScissor (View view) {
        if (randNumber == 1)
        {
            TextView ai_choice = (TextView) findViewById(R.id.AI_choice);
            ai_choice.setText("Paper");
            Toast.makeText(this,"You Win!", LENGTH_SHORT).show();
            winCount++;
        }
        else if (randNumber == 2)
        {
            TextView ai_choice = (TextView) findViewById(R.id.AI_choice);
            ai_choice.setText("Scissor");
            Toast.makeText(this,"Draw!", LENGTH_SHORT).show();
        }
        else
        {
            TextView ai_choice = (TextView) findViewById(R.id.AI_choice);
            ai_choice.setText("Rock");
            Toast.makeText(this,"You Lose!", LENGTH_SHORT).show();
            lossCount++;
        }
        TextView winCounter = (TextView) findViewById(R.id.winCounter);
        TextView lossCounter = (TextView) findViewById(R.id.lossCounter);
        winCounter.setText(winCount + "");
        lossCounter.setText(lossCount + "");
        setNumbers();
    }


}
