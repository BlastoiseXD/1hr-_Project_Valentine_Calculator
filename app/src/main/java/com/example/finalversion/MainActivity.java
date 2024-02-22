package com.example.finalversion;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public EditText fi, si;
    public TextView f_name, L_name, Result;
    public Button Res;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        f_name = findViewById(R.id.textView);
        L_name = findViewById(R.id.textView3);
        fi = findViewById(R.id.editTextText);
        si = findViewById(R.id.editTextText2);
        Result = findViewById(R.id.textView4);
        Res = findViewById(R.id.button);

        Res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, " Gracias for using this app Amigos !!! have a good time ", Toast.LENGTH_LONG).show();

                String name1 = f_name.getText().toString().toLowerCase();
                String name2 = L_name.getText().toString().toLowerCase();
                int loveScore = calculateLoveScore(name1, name2);

                String result = "Love Score: " + loveScore + "%";
                Result.setText(result);

            }

        });

    }
    private int calculateLoveScore(String name1, String name2) {
        if (name1.equals("shreya") && name2.equals("sabin")) {
            return 0;
        } else if (name1.equalsIgnoreCase("asmita")&&name2.equalsIgnoreCase("nitish")) {
            return 100;


        } else if (name1.equalsIgnoreCase("aayush")&&name2.equalsIgnoreCase("shristi")) {
            return 100;
        } else if (name1.equalsIgnoreCase("Shreya")&&name2.equalsIgnoreCase("usarmy")) {
            return 100;

        } else if (name1.equalsIgnoreCase("Anshu")&&name2.equalsIgnoreCase("Kshitiz")) {
            return 1;

        } else if (name1.equalsIgnoreCase("asmita")&&name2.equalsIgnoreCase("anilkumar")) {
            return 99;

        } else {

            Random random = new Random();
            return random.nextInt(100) + 1;

        }
    }
}