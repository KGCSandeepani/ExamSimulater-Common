/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.examsimulator.common.controller.factory;

import com.examsimulator.common.controller.AnswerController;
import com.examsimulator.common.controller.ExamController;
import com.examsimulator.common.controller.ExamDetailController;
import com.examsimulator.common.controller.MarksController;
import com.examsimulator.common.controller.QuestionController;
import com.examsimulator.common.controller.StudentController;
import com.examsimulator.common.controller.SubjectContoller;
import com.examsimulator.common.controller.SuperController;
import com.examsimulator.common.controller.TestDeveloperController;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Lahiru Sandeepa
 */
public interface ControllerFactory extends Remote{

    public enum ControllerTypes{
        ANSWER, EXAM, EXAMDETAIL, MARKS, QUESTION, STUDENT, SUBJECT, TESTDEVELOPER, LOGIN;
    }
    
    public SuperController getController(ControllerTypes controller)throws RemoteException;

//    public AnswerController getAnswerController() throws RemoteException;
//
//    public ExamController getExamController() throws RemoteException;
//
//    public ExamDetailController getExamDetailController() throws RemoteException;
//
//    public MarksController getMarksController() throws RemoteException;
//
//    public QuestionController getQuestionController() throws RemoteException;
//
//    public StudentController getStudentController() throws RemoteException;
//
//    public SubjectContoller getSubjectContoller() throws RemoteException;
//
//    public TestDeveloperController getTestDeveloperController() throws RemoteException;
}
