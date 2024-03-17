package org.example;

public enum AzimuthAnswer {
    NONE(-1),
    ANY(-2);

    private int answerCode;

    AzimuthAnswer(int answerCode) {
        this.answerCode = answerCode;
    }

    public int getAnswerCode() {
        return answerCode;
    }

    public void setAnswerCode(int answerCode) {
        this.answerCode = answerCode;
    }
}
