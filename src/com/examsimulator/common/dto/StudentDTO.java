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
public class StudentDTO extends SuperDTO{
    private String studentId;
    private String studentName;
    private String nic;
    private int telephoneNo;

    public StudentDTO() {
    }

    public StudentDTO(String studentId, String studentName, String nic, int telephoneNo) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.nic = nic;
        this.telephoneNo = telephoneNo;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public int getTelephoneNo() {
        return telephoneNo;
    }

    public void setTelephoneNo(int telephoneNo) {
        this.telephoneNo = telephoneNo;
    }
    
}
