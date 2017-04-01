package com.app.quiz.quizapp;

import android.widget.CheckBox;

public class Question1 implements Question {

    private CheckBox answerCheckBox;

    public Question1(CheckBox answerCheckBox) {
        this.answerCheckBox = answerCheckBox;
    }

    @Override
    public boolean isAnsweredCorrectly() {
        return answerCheckBox.isChecked();
    }
}
