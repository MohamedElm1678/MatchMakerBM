package com.example.MatchMaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.awt.font.NumericShaper;

public class MainActivity extends AppCompatActivity {
    protected Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startButton = (Button) findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNumberOfPeople();
            }
        });
    }

    public void openNumberOfPeople() {
        Intent open = new Intent(this, NumberOfPeople.class);
        startActivity(open);
    }


}
