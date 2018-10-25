/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examsimulator.common.controller;

import com.examsimulator.common.dto.StudentDTO;
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
public interface StudentController extends SuperController<StudentDTO> {

//    public boolean addStudent(StudentDTO student) throws RemoteException, IOException;

    public boolean modifyStudent(StudentDTO student) throws RemoteException, FileNotFoundException, IOException;

//    public boolean removeStudent(String studentId) throws RemoteException, FileNotFoundException, IOException;

//    public StudentDTO searchByIdStudent(String studentId) throws RemoteException, FileNotFoundException, IOException;

    public StudentDTO searchByNameStudent(String studentName) throws RemoteException, FileNotFoundException, IOException;

    public List<StudentDTO> getAllStudent() throws RemoteException, FileNotFoundException, IOException;

    public boolean reserveStudent(String studentId) throws RemoteException;

    public boolean releaseStudent(String studentId) throws RemoteException;

}
