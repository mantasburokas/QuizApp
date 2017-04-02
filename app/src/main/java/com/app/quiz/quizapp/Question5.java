package com.app.quiz.quizapp;

import android.widget.CheckBox;

public class Question5 implements Question {

    private CheckBox correctCheckBox1;
    private CheckBox incorrectCheckBox1;
    private CheckBox correctCheckBox2;
    private CheckBox incorrectCheckBox2;

    public Question5(CheckBox correctCheckBox1, CheckBox incorrectCheckBox1, CheckBox correctCheckBox2, CheckBox incorrectCheckBox2) {
        this.correctCheckBox1 = correctCheckBox1;
        this.incorrectCheckBox1 = incorrectCheckBox1;
        this.correctCheckBox2 = correctCheckBox2;
        this.incorrectCheckBox2 = incorrectCheckBox2;
    }

    @Override
    public boolean isAnsweredCorrectly() {
        return correctCheckBox1.isChecked() && correctCheckBox2.isChecked() && !incorrectCheckBox1.isChecked() && !incorrectCheckBox2.isChecked();
    }
}
