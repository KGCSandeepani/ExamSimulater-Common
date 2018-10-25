/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examsimulator.common.controller;

import com.examsimulator.common.dto.SuperDTO;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Lahiru Sandeepa
 */
public interface SuperController<T extends SuperDTO> extends Remote{
    
    public boolean add(T t) throws RemoteException, IOException;

//    public boolean update(T t) throws RemoteException, SQLException, ClassNotFoundException;

    public boolean delete(String id) throws RemoteException, IOException, FileNotFoundException;

    public T search(String string) throws RemoteException, IOException, FileNotFoundException;

//    public ArrayList<T> getAll() throws RemoteException, SQLException, ClassNotFoundException;

    public String generateId()throws RemoteException, FileNotFoundException, IOException;
    
}
