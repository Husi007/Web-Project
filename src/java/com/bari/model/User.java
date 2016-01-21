package com.bari.model;
//import java.util.Date;

public class User {
   String id, uname, password, email, registeredon;
   
   //Date registeredon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getRegisteredon() {
        return registeredon;
    }

    public void setRegisteredon(String registeredon) {
        this.registeredon = registeredon;
    }
/*
    public Date getRegisteredon() {
        return registeredon;
    }

    public void setRegisteredon(Date registeredon) {
        this.registeredon = registeredon;
    }
*/
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }  
   
}
