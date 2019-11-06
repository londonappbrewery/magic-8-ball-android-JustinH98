package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button predictionButton = (Button) findViewById(R.id.button_Predict);
        final ImageView magic8Ball = (ImageView) findViewById(R.id.imageView_magic8Ball);
        final int[] magic8BallArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        predictionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomNumberGenerator = new Random();
                int randomInt = randomNumberGenerator.nextInt(5);

                magic8Ball.setImageResource(magic8BallArray[randomInt]);
            }
        });
    }
}
