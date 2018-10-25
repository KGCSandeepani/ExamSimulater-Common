/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examsimulator.common.controller;

import com.examsimulator.common.dto.ExamDetailDTO;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lahiru Sandeepa
 */
public interface ExamDetailController extends SuperController<ExamDetailDTO> {

//    public boolean addExamDetail(ExamDetailDTO examDetail) throws RemoteException, IOException;
//
//    public boolean removeExamDetail(String examDetailId) throws RemoteException, FileNotFoundException, IOException;
//
//    public ExamDetailDTO searchExamDetail(String examDetailId) throws RemoteException, FileNotFoundException, IOException;
    
    public List<String> getQuestionId(String examId) throws RemoteException, FileNotFoundException, IOException;

    
}
