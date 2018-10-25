/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examsimulator.common.controller;

import com.examsimulator.common.dto.QuestionDTO;
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
public interface QuestionController extends SuperController<QuestionDTO> {

//    public boolean addQuestion(QuestionDTO question) throws RemoteException, IOException;

    public boolean modifyQuestion(QuestionDTO question) throws RemoteException, IOException;

//    public boolean removeQuestion(String questionId) throws RemoteException, FileNotFoundException, IOException;

//    public QuestionDTO searchQuestion(String questionId) throws RemoteException, FileNotFoundException, IOException;

    public List<QuestionDTO> getAllQuestion() throws RemoteException, FileNotFoundException, IOException;
    
    public List<QuestionDTO> getSelectedQuestion(String subjectId,String testDeveloperId) throws RemoteException, FileNotFoundException, IOException;

    public List<QuestionDTO> getQuestion(String subjectId) throws RemoteException, FileNotFoundException, IOException;
    
    public int calculateTime(List<String> questionIdList) throws RemoteException, FileNotFoundException, IOException;

    public boolean reserveQuestion(String questionId) throws RemoteException;

    public boolean releaseQuestion(String questionId) throws RemoteException;
}
