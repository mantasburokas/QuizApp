package com.app.quiz.quizapp;

import android.widget.RadioButton;

public class Question1 implements Question {

    private RadioButton radioButton;

    public Question1(RadioButton radioButton) {
        this.radioButton = radioButton;
    }

    @Override
    public boolean isAnsweredCorrectly(){
        return radioButton.isChecked();
    }
}
