package com.app.quiz.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Question question1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox q1CheckBox = (CheckBox) findViewById(R.id.answerCheckBox);

        question1 = new Question1(q1CheckBox);
    }

    protected void calculateScore(View view) {
        boolean answeredCorrectly = question1.isAnsweredCorrectly();

        Toast toast = Toast.makeText(getApplicationContext(), answeredCorrectly ? "Answered 1/1" : "Answered 1/0", Toast.LENGTH_SHORT);
        toast.show();
    }
}
