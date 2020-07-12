/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import com.ws.MengaduWS_Service;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Jojo
 */
@ManagedBean
@RequestScoped
public class Register {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/mengaduWS/mengaduWS.wsdl")
    private MengaduWS_Service service;

    private String password;
    private int matricno;
    private String name;
    private int courseID;
    private int yearID;

    public int getMatricNo() {

        return matricno;
    }

    public void setMatricNo(int matricno) {
        this.matricno = matricno;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
     public int getCourseID() {

        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourse() {

        return stCourse(courseID);
    }
    public void setYearID(int yearID) {
        this.yearID = yearID;
    }
   
    public int getYearID() {
        return yearID;
    }
    
    public String getYear(){
        return stYear(yearID);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void registerData() throws IOException {

        try {
            Statement st;
            st = dbConnection.getInstance().dbCon();
            Connection conn = st.getConnection();

            PreparedStatement ps = conn.prepareStatement("INSERT INTO STUDENTS (MATRIC,PASSWORD,USERNAME,COURSE,SYEAR) VALUES(?,?,?,?,?)");
            ps.setInt(1, getMatricNo());
            ps.setString(2, getPassword());
            ps.setString(3, getName());
            ps.setString(4, getCourse());
            ps.setString(5, getYear());

            ps.executeUpdate();
            
            FacesContext context = FacesContext.getCurrentInstance();
            context.getExternalContext().redirect("signin.xhtml");
             

        } catch (SQLException ex) {
            Logger.getLogger(loginBean.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    private String stCourse(int inCourse) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ws.MengaduWS port = service.getMengaduWSPort();
        return port.stCourse(inCourse);
    }

    private String stYear(int year) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        com.ws.MengaduWS port = service.getMengaduWSPort();
        return port.stYear(year);
    }

}
