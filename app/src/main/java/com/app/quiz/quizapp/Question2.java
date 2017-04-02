package com.app.quiz.quizapp;

import android.widget.RadioButton;

public class Question2 implements Question {

    private RadioButton radioButton;

    public Question2(RadioButton radioButton) {
        this.radioButton = radioButton;
    }

    @Override
    public boolean isAnsweredCorrectly(){
        return radioButton.isChecked();
    }
}
