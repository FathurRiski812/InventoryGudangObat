/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN9EXCEPTION;

/**
 *
 * @author Fatur Riski
 */
public class Login {
    private String userrname, password;
    public String nama;
    public Login(){
        nama = "Fathur Riski";
        userrname = "Fatur";
        password = "ryu123";
    }
    public String getUserrname(){
        return userrname; 
    }
    public void setUserrname(String userrname){
        this.userrname = userrname;
    }
    public String getPassword(){
        return userrname;
    }
    public void setUserrname(){
        this.password = password;
    }
    boolean CekLogin(String Userrname, String password){
        if(Userrname.equals(getUserrname())&&password.equals(getPassword())){
        return true;
    }
        return false;
    }
    
}