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
public class TestDeveloperDTO extends SuperDTO{
    private String testDeveloperId;
    private String testDeveloperName;
    private String nic;
    private int telephoneNo;

    public TestDeveloperDTO() {
    }

    public TestDeveloperDTO(String testDeveloperId, String testDeveloperName, String nic, int telephoneNo) {
        this.testDeveloperId = testDeveloperId;
        this.testDeveloperName = testDeveloperName;
        this.nic = nic;
        this.telephoneNo = telephoneNo;
    }

    public String getTestDeveloperId() {
        return testDeveloperId;
    }

    public void setTestDeveloperId(String testDeveloperId) {
        this.testDeveloperId = testDeveloperId;
    }

    public String getTestDeveloperName() {
        return testDeveloperName;
    }

    public void setTestDeveloperName(String testDeveloperName) {
        this.testDeveloperName = testDeveloperName;
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
