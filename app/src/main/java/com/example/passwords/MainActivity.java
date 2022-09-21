package com.example.passwords;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText pass1;
    EditText pass2;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String passw = pass1.getText().toString();
                String passc = pass1.getText().toString();
                if(passw.equals(passc)){
                    text.setText("Thank You");
                } else {
                    text.setText("Passwords Must Match");
                }


            }

        });



    }

}