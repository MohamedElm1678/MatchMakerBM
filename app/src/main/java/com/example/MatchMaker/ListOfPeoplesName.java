package com.example.MatchMaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;




public class ListOfPeoplesName extends AppCompatActivity {
    protected Button backButton;
    protected Button nextButton;
    protected TextView viewNumberOfThePlayer;

    Intent startingIntent = getIntent();
    String textNumberOfPlayers = startingIntent.getStringExtra("message");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_peoples_name);
        nextButton = findViewById(R.id.nextButtonListOfPeoplesName);
        backButton = findViewById(R.id.backButton_ListOfPeoplesName);
        viewNumberOfThePlayer = findViewById(R.id.numberOfThePlayer);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNumberOfPeople();
            }
        });

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewNumberOfThePlayer.setText(textNumberOfPlayers);
            }
        });
    }

    public void openNumberOfPeople() {
        Intent open = new Intent(this, NumberOfPeople.class);
        startActivity(open);
    }


}
