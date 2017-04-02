package com.app.quiz.quizapp.Questions;

import android.widget.RadioButton;

public class QuestionRadioButton implements Question {

    private RadioButton radioButton;

    public QuestionRadioButton(RadioButton radioButton) {
        this.radioButton = radioButton;
    }

    @Override
    public boolean isAnsweredCorrectly(){
        return radioButton.isChecked();
    }
}
