
import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

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
 
@ManagedBean @SessionScoped
public class loginBean {
 
    private String userName;
    private String password;
 
    public String getUserName() {
        return userName;
    }
 
    public void setUserName(String userName) {
        this.userName = userName;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
 
    public String validateUserLogin() {
        String navResult = "";
        System.out.println("Entered Username is= " + userName + ", password is= " + password);
        if (userName.equalsIgnoreCase("aeinsabtu") && password.equals("lala")) {
            navResult = "success";
        } else {
            navResult = "failure";
        }
        return navResult;
    }
}