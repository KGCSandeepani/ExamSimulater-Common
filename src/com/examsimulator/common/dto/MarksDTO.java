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
public class MarksDTO extends SuperDTO{
    private String marksId;
    private String examId;
    private int marks;

    public MarksDTO() {
    }

    public MarksDTO(String marksId, String examId, int marks) {
        this.marksId = marksId;
        this.examId = examId;
        this.marks = marks;
    }

    public String getMarksId() {
        return marksId;
    }

    public void setMarksId(String marksId) {
        this.marksId = marksId;
    }
    
    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    
}
