/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author user
 */
@ManagedBean
@RequestScoped
public class complaint {

    private String category,
            message;
    private List<complaintList> list = new ArrayList<complaintList>();

    /**
     * Creates a new instance of complaint
     */
    public complaint() {
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

 

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public List<complaintList> getList() {
        return list;
    }

    public void setList(List<complaintList> list) {
        this.list = list;
    }

    public void masukMatric(String matric) {

    }

    public void insertComplaint() throws IOException {
        String[] temp = new String[4];
        try {
            Statement st;
            st = dbConnection.getInstance().dbCon();
            Connection conn = st.getConnection();
            FacesContext context = FacesContext.getCurrentInstance();
            String m = context.getExternalContext().getSessionMap().get("matric").toString();
            
            PreparedStatement ps = conn.prepareStatement("INSERT INTO COMPLAINT (COMTYPE,USERID,COMDETAIL,COMDATE,STATUS) VALUES(?,?,?,CURRENT_TIMESTAMP,'PENDING')");
            ps.setString(1, getCategory());
            ps.setString(2, m);
            ps.setString(3, getMessage());

            ps.executeUpdate();

            context.getExternalContext().redirect("AddComplaint.xhtml");

        } catch (SQLException ex) {
            Logger.getLogger(loginBean.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    public void retrieveComplaint() throws IOException {
        try {
            Statement st;
            st = dbConnection.getInstance().dbCon();
            Connection conn = st.getConnection();
            

            PreparedStatement ps = conn.prepareStatement("SELECT * FROM COMPLAINT");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(new complaintList(rs.getString(2),
                        rs.getString(4), rs.getString(3), rs.getString(5)));

            }

        } catch (SQLException ex) {
            Logger.getLogger(loginBean.class.getName()).log(Level.SEVERE, null, ex);

        }

    }
    
    public void retrieveStatus() throws IOException {
        try {
            Statement st;
            st = dbConnection.getInstance().dbCon();
            Connection conn = st.getConnection();
            
            FacesContext context = FacesContext.getCurrentInstance();
            String m = context.getExternalContext().getSessionMap().get("matric").toString();

            PreparedStatement ps = conn.prepareStatement("SELECT * FROM COMPLAINT WHERE USERID=?");
            ps.setString(1, m);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                list.add(new complaintList(rs.getString(2),
                        rs.getString(4), rs.getString(3), rs.getString(5)));

            }

        } catch (SQLException ex) {
            Logger.getLogger(loginBean.class.getName()).log(Level.SEVERE, null, ex);

        }

    }
    
    
}
