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
public class ExamDTO extends SuperDTO{
    private String examId;
    private String studentId;
    private String date;
    private String time;

    public ExamDTO() {
    }

    public ExamDTO(String examId, String studentId, String date, String time) {
        this.examId = examId;
        this.studentId = studentId;
        this.date = date;
        this.time = time;
    }

    public String getExamId() {
        return examId;
    }

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
}
