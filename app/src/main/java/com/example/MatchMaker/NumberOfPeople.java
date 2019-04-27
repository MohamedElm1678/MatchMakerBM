package com.example.MatchMaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NumberOfPeople extends AppCompatActivity {
    protected Button backButton;
    protected Button submitButton;
    protected EditText textNumberOfPlayers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_of_people);


        submitButton = (Button) findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textNumberOfPlayers = findViewById(R.id.editTextNumberOfPlayers);
                String stringTextNumberOfPlayers = textNumberOfPlayers.getText().toString();
                Intent moveText = new Intent(NumberOfPeople.this, ListOfPeoplesName.class);
                moveText.putExtra("message", stringTextNumberOfPlayers);
                startActivity(moveText);
                openListOfPeoplesName();
            }
        });

        backButton = (Button) findViewById(R.id.backButton_NumberOfPeople);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }

    public void openMainActivity() {
        Intent open = new Intent(this, MainActivity.class);
        startActivity(open);
    }

    public void openListOfPeoplesName() {
        Intent open = new Intent(this, ListOfPeoplesName.class);
        startActivity(open);
    }


}
