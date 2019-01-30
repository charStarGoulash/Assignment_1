package com.example.mobile_a1;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    private Button GoToSecondPage;
    private Switch bgcolor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bgcolor = (Switch) findViewById(R.id.SwitchNightMode);
        GoToSecondPage= (Button) findViewById(R.id.SendPage2Btn);
        //listen on button
        GoToSecondPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Start your second activity
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
        bgcolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ConstraintLayout c1 = (ConstraintLayout)findViewById(R.id.BackgroundColour);

                c1.setBackgroundColor(Color.BLACK);

                //c1.setBackgroundColor(Color.WHITE);

            }

        });

    }
}
