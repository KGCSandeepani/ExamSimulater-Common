/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examsimulator.common.controller;

import com.examsimulator.common.dto.ExamDTO;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Lahiru Sandeepa
 */
public interface ExamController extends SuperController<ExamDTO>{

//    public boolean addExam(ExamDTO exam) throws RemoteException, IOException;
//
//    public boolean removeExam(String examId) throws RemoteException, FileNotFoundException, IOException;
//
//    public ExamDTO searchExamByExamId(String examId) throws RemoteException, FileNotFoundException, IOException;
    
    public List<ExamDTO> searchExamStudentId(String studentId) throws RemoteException, FileNotFoundException, IOException;

    
    
}
