/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examsimulator.common.controller;

import com.examsimulator.common.dto.MarksDTO;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Lahiru Sandeepa
 */
public interface MarksController extends SuperController<MarksDTO> {

//    public boolean addMarks(MarksDTO marks) throws RemoteException, IOException;

    public boolean modifyMarks(MarksDTO marks) throws RemoteException, IOException;

//    public boolean removeMarks(String examDetailId) throws RemoteException, FileNotFoundException, IOException;
//
//    public MarksDTO searchMarks(String examDetailId) throws RemoteException, FileNotFoundException, IOException;

    public String generateId()throws RemoteException, FileNotFoundException, IOException;
    
}
