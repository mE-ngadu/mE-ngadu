/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;
import javax.jws.Oneway;

/**
 *
 * @author user
 */
@WebService(serviceName = "mengaduWS")
@Stateless()
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
                course = "SOFFTWARE ENGINEERING";
                break;
            case 2:
                course = "COMPUTER NETWORK";
                break;
            case 3:
                course = "MULTIMEDIA";
                break;
            case 4:
                course = "COMPUTER SYSTEM";    
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
                stYear = "FIRST YEAR";
                break;
            case 2:
                stYear = "SECOND YEAR";
                break;
            case 3:
                stYear = "THIRD YEAR";
                break;
            case 4:
                stYear = "FINAL YEAR";    
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
                break;
            
            case 2:
                status ="viewed";
                break;
            
            case 3:
                status ="completed";
        }
            
        return status;
    }

    
    
}
