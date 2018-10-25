/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examsimulator.common.controller;

import com.examsimulator.common.dto.SubjectDTO;
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
public interface SubjectContoller extends SuperController<SubjectDTO> {

//    public boolean addSubject(SubjectDTO subject) throws RemoteException, IOException;

    public boolean modifySubject(SubjectDTO subject) throws RemoteException, IOException;

//    public boolean removeSubject(String subjectId) throws RemoteException, FileNotFoundException, IOException;

    public SubjectDTO searchByNameSubject(String subjectName) throws RemoteException, FileNotFoundException, IOException;

    public List<SubjectDTO> getAllSuject() throws RemoteException, FileNotFoundException, IOException;

    public boolean reserveSubject(String subjectId) throws RemoteException;

    public boolean releaseSubject(String subjectId) throws RemoteException;

//    public SubjectDTO searchByNameSubject(String name);
}
