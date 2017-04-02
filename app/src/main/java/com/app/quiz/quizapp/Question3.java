package com.app.quiz.quizapp;

import android.widget.RadioButton;

public class Question3 implements Question {

    private RadioButton radioButton;

    public Question3(RadioButton radioButton) {
        this.radioButton = radioButton;
    }

    @Override
    public boolean isAnsweredCorrectly(){
        return radioButton.isChecked();
    }
}
