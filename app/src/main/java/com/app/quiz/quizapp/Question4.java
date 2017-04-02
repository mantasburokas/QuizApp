package com.app.quiz.quizapp;

import android.widget.RadioButton;

public class Question4 implements Question {

    private RadioButton radioButton;

    public Question4(RadioButton radioButton) {
        this.radioButton = radioButton;
    }

    @Override
    public boolean isAnsweredCorrectly(){
        return radioButton.isChecked();
    }
}
