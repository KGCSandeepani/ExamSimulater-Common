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
public class ExamDetailDTO extends SuperDTO{
    private String examDetailId;
    private String examId;
    private String questionId;

    public ExamDetailDTO() {
    }

    public ExamDetailDTO(String examDetailId, String examId, String questionId) {
        this.examDetailId = examDetailId;
        this.examId = examId;
        this.questionId = questionId;
    }

    public String getExamDetailId() {
        return examDetailId;
    }

    public void setExamDetailId(String examDetailId) {
        this.examDetailId = examDetailId;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }
}
