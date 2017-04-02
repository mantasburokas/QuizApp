package com.app.quiz.quizapp.Questions;

import android.widget.EditText;

import com.app.quiz.quizapp.Questions.Helpers.QuestionTextAnswers;

public class QuestionEditText implements Question {

    private EditText editText;

    public QuestionEditText(EditText editText) {
        this.editText = editText;
    }

    @Override
    public boolean isAnsweredCorrectly() {
        String answerInput = editText.getText().toString().toLowerCase();

        String answer = QuestionTextAnswers.Homophobia.toString().toLowerCase();

        return answer.equals(answerInput);
    }
}
