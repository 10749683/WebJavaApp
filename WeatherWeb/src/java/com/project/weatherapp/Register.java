/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.weatherapp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped

/**
 *
 * @author Lewwa
 */
public class Register {
    
    
    
    private String username;
    private String email;
    private String password;
    private String password2;

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPassword2() {
        return password2;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }
    
   public String SaveRegister() throws FileNotFoundException{
       
       String saved ="";
    
       if (password.equals(password2)){
           
            try (PrintStream saveData = new PrintStream(new FileOutputStream("users.txt"))){
            saveData.print(username);
            saveData.print(email);
            saveData.print(password);
            saveData.print(password2);
            
            saved = "Register Successful!";
       
       }
            
       
      
      }else{
           saved = "Register Failed!";
       }
        return saved;
       
    
    
}
   
}
