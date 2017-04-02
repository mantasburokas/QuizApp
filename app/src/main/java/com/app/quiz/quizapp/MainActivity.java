package com.app.quiz.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.app.quiz.quizapp.Questions.Question;
import com.app.quiz.quizapp.Questions.QuestionEditText;
import com.app.quiz.quizapp.Questions.QuestionRadioButton;
import com.app.quiz.quizapp.Questions.QuestionTwoCheckBoxes;

public class MainActivity extends AppCompatActivity {

    private Question question1;
    private Question question2;
    private Question question3;
    private Question question4;
    private Question question5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton q1Answer = (RadioButton) findViewById(R.id.q1Answer);
        question1 = new QuestionRadioButton(q1Answer);

        EditText q2Answer = (EditText) findViewById(R.id.q2Answer);
        question2 = new QuestionEditText(q2Answer);

        RadioButton q3Answer = (RadioButton) findViewById(R.id.q3Answer);
        question3 = new QuestionRadioButton(q3Answer);

        RadioButton q4Answer = (RadioButton) findViewById(R.id.q4Answer);
        question4 = new QuestionRadioButton(q4Answer);

        CheckBox q5Answer1 = (CheckBox) findViewById(R.id.q5Answer1);
        CheckBox q5Answer2 = (CheckBox) findViewById(R.id.q5Answer2);
        CheckBox q5Answer3 = (CheckBox) findViewById(R.id.q5Answer3);
        CheckBox q5Answer4 = (CheckBox) findViewById(R.id.q5Answer4);
        question5 = new QuestionTwoCheckBoxes(q5Answer1, q5Answer2, q5Answer3, q5Answer4);
    }

    protected void calculateScore(View view) {
        boolean[] answers = new boolean[5];

        answers[0] = question1.isAnsweredCorrectly();
        answers[1] = question2.isAnsweredCorrectly();
        answers[2] = question3.isAnsweredCorrectly();
        answers[3] = question4.isAnsweredCorrectly();
        answers[4] = question5.isAnsweredCorrectly();

        int numAnsweredCorrectly = 0;

        for (boolean answer : answers) {
            if (answer) {
                numAnsweredCorrectly++;
            }
        }

        String message = String.format("You've answered correctly %d/5", numAnsweredCorrectly);

        Toast toast = Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT);
        toast.show();
    }
}
