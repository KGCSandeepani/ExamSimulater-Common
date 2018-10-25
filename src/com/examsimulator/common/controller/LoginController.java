/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examsimulator.common.controller;

import com.examsimulator.common.dto.LoginDTO;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.rmi.RemoteException;

/**
 *
 * @author Lahiru Sandeepa
 */
public interface LoginController extends SuperController<LoginDTO>{
    
    public LoginDTO searchLoginByUNAndPW(String userName,String password)throws RemoteException, IOException, FileNotFoundException;
    
}
