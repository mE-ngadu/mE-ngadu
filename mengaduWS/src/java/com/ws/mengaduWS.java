/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws;

import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Azmone
 */
@WebService(serviceName = "mengaduWS")
public class mengaduWS {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "studentName")
    @Oneway
    public void studentName(@WebParam(name = "inName") String inName) {
        String temp = inName;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "inMatric")
    @Oneway
    public void inMatric(@WebParam(name = "matric") int matric) {
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "stCourse")
    public String stCourse(@WebParam(name = "inCourse") int inCourse) {
        //TODO write your implementation code here:
        String course=null;
        switch(inCourse){
            case 1:
                course = "Software Engineering";
            case 2:
                course = "Networking";
            case 3:
                course = "Multimedia";
            case 4:
                course = "Computer System";    
        }
        return course;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "stYear")
    public String stYear(@WebParam(name = "year") int year) {
        //TODO write your implementation code here:
        String stYear = null;
          switch(year){
            case 1:
                stYear = "First Year";
            case 2:
                stYear = "Second Year";
            case 3:
                stYear = "Third Year";
            case 4:
                stYear = "Final Year";    
        }
        return stYear;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "inComplaint")
    public String inComplaint(@WebParam(name = "complaint") String complaint) {
        //TODO write your implementation code here:
        String temp = complaint;
        return temp;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "comStatus")
    public String comStatus(@WebParam(name = "stat") int stat) {
        //TODO write your implementation code here:
        String status = null;
        switch (stat){
            case 1:
                status ="pending";
            
            case 2:
                status ="viewed";
            
            case 3:
                status ="completed";
        }
            
        return status;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "stduentPass")
    public String stduentPass(@WebParam(name = "pass") String pass) {
        //TODO write your implementation code here:
        String temp = pass;
        return temp;
    }


}
