/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examsimulator.common.dto;

import java.io.Serializable;

/**
 *
 * @author Lahiru Sandeepa
 */
public class QuestionDTO extends SuperDTO{
    private String questionId;
    private String subjectId;
    private String testDeveloperId;
    private String question;
    private String optionOne;
    private String optionTwo;
    private String optionThree;
    private String optionFour;
    private int time;

    public QuestionDTO() {
    }

    public QuestionDTO(String questionId, String subjectId, String testDeveloperId, String question, String optionOne, String optionTwo, String optionThree, String optionFour, int time) {
        this.questionId = questionId;
        this.subjectId = subjectId;
        this.testDeveloperId = testDeveloperId;
        this.question = question;
        this.optionOne = optionOne;
        this.optionTwo = optionTwo;
        this.optionThree = optionThree;
        this.optionFour = optionFour;
        this.time = time;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getSubjectId() {
        return subjectId;
    }
    
    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public String getTestDeveloperId() {
        return testDeveloperId;
    }

    public void setTestDeveloperId(String testDeveloperId) {
        this.testDeveloperId = testDeveloperId;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptionOne() {
        return optionOne;
    }

    public void setOptionOne(String optionOne) {
        this.optionOne = optionOne;
    }

    public String getOptionTwo() {
        return optionTwo;
    }

    public void setOptionTwo(String optionTwo) {
        this.optionTwo = optionTwo;
    }

    public String getOptionThree() {
        return optionThree;
    }

    public void setOptionThree(String optionThree) {
        this.optionThree = optionThree;
    }

    public String getOptionFour() {
        return optionFour;
    }

    public void setOptionFour(String optionFour) {
        this.optionFour = optionFour;
    }
    
    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    
}
