package com.example.techquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String [] questions = {"Java is a Person?","Java Was Introduced in 1823","Jav was created using Python?","Java has abstract classes?","Java supports interfaces?"};
    private boolean [] answers = {false,false,false,true,true};
    private int score = 0;
    Button yes;
    Button no;
    TextView textView;
    private int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        textView = findViewById(R.id.textView2);
        textView.setText(questions[index]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        if(index <= questions.length - 1) {
            if(answers[index]){
                   score++;
        }
            index++;
            if(index <= questions.length - 1) {
                textView.setText(questions[index]);
            }
            else {
                Toast.makeText(MainActivity.this, "Your Score is " + score + "/" + questions.length, Toast.LENGTH_SHORT).show();
            }
            }
        else {
            Toast.makeText(MainActivity.this, "Restart This App For Play Again", Toast.LENGTH_SHORT).show();
        }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index <= questions.length - 1) {
                    if(!answers[index]){
                        score++;
                    }
                    index++;
                    if(index <= questions.length - 1) {
                        textView.setText(questions[index]);
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Your Score is " + score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart This App For Play Again", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}