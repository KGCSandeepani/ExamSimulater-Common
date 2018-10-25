/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examsimulator.common.controller;

import com.examsimulator.common.dto.TestDeveloperDTO;
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
public interface TestDeveloperController extends SuperController<TestDeveloperDTO> {

//    public boolean addTestDeveloper(TestDeveloperDTO testDeveloper) throws RemoteException, IOException;

    public boolean modifyTestDeveloper(TestDeveloperDTO testDeveloper) throws RemoteException, FileNotFoundException, IOException;

//    public boolean removeTestDeveloper(String testDeveloperId) throws RemoteException, FileNotFoundException, IOException;

//    public TestDeveloperDTO searchByIdTestDeveloper(String testDeveloperId) throws RemoteException, FileNotFoundException, IOException;

    public TestDeveloperDTO searchByNameTestDeveloper(String testDeveloperName) throws RemoteException, FileNotFoundException, IOException;

    public List<TestDeveloperDTO> getAllTestDeveloper() throws RemoteException, FileNotFoundException, IOException;

    public boolean reserveTestDeveloper(String testDeveloperId) throws RemoteException;

    public boolean releaseTestDeveloper(String testDeveloperId) throws RemoteException;
}
