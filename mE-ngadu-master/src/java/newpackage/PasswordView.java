
import javax.faces.bean.RequestScoped;
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


@Named
@RequestScoped
public class PasswordView {
    
    private String password1;   
    private String matricno;
    private String fname;
    private String lname;
    private String email;
    
    
    public String getMatricNo() {
        
        return matricno;
    }
    
    public void setMatricNo(String matricno){
        this.matricno= matricno;
    }
    public String getfname() {
        
        return fname;
    }
    
    public void setfname(String fname){
        this.fname= fname;
    }
    
    public String getlname() {
        
        return lname;
    }
    
    public void setlname(String lname){
        this.lname= lname;
    }
    
     public String getemail() {
        
        return lname;
    }
    
    public void setemail(String email){
        this.email= email;
    }
    
    public String getPassword1() {
        return password1;
    }
 
    public void setPassword1(String password1) {
        this.password1 = password1;
    }
 
 
}
