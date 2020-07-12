package newpackage;

import java.io.IOException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author noraeinsabtu
 */
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;

@ManagedBean
@SessionScoped
public class loginBean {

    private int matric;
    private String password;

    public void setMatric(int matric) {
        this.matric = matric;
    }

    public int getMatric() {
        return matric;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void validateUserLogin() throws IOException {
        int m = getMatric();

        try {
            Statement st;
            st = dbConnection.getInstance().dbCon();
            Connection conn = st.getConnection();
            ResultSet rs;

            PreparedStatement ps = conn.prepareStatement("SELECT * FROM students WHERE MATRIC=? AND PASSWORD =?");
            ps.setInt(1, m);
            ps.setString(2, getPassword());
            rs = ps.executeQuery();
            if (rs.next()) {

                String name = rs.getString(3);
                String course = rs.getString(4);
                String year = rs.getString(5);
                
                FacesContext context = FacesContext.getCurrentInstance();
              
                context.getExternalContext().getSessionMap().put("matric", m);
                context.getExternalContext().getSessionMap().put("name", name);
                context.getExternalContext().getSessionMap().put("course", course);
                context.getExternalContext().getSessionMap().put("year", year);

                context.getExternalContext().redirect("AddComplaint.xhtml");
            } else {
                FacesContext context = FacesContext.getCurrentInstance();
                context.getExternalContext().redirect("signup.xhtml");
            }

        } catch (SQLException ex) {
            Logger.getLogger(loginBean.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    public String logout() {
        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
        return "signin.xhtml";
    }

}
