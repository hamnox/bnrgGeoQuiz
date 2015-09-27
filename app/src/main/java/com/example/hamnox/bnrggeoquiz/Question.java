package com.example.hamnox.bnrggeoquiz;

/**
 * Created by hamnox on 9/26/15.
 */
public class Question {
    private int mQuestion;
//    private int mQuestionType;

 //   private String[] mChoices;
    private String mAnswer;

    public Question(int question) {
        mQuestion = question;
    }

    public int getQuestion() {
        return mQuestion;
    }
    public void setAnswer(String answer) {
        mAnswer = answer;
    }


}
