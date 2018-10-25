/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examsimulator.common.controller;

import com.examsimulator.common.dto.AnswerDTO;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Lahiru Sandeepa
 */
public interface AnswerController extends SuperController<AnswerDTO> {

//    public boolean addAnswer(AnswerDTO answer) throws RemoteException, IOException;
//
    public boolean modifyAnswer(AnswerDTO answer) throws RemoteException, IOException;
//
//    public boolean removeAnswer(String questionId) throws RemoteException, FileNotFoundException, IOException;
//
//    public AnswerDTO searchAnswer(String questionId) throws RemoteException, FileNotFoundException, IOException;

    
    
    public boolean reserveAnswer(String answerId) throws RemoteException;

    public boolean releaseAnswer(String answerId) throws RemoteException;
}
