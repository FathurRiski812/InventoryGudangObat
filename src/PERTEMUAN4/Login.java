/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN4;

/**
 *
 * @author Fatur Riski
 */
public class Login {
    private String username,password;
    public String nama;
    
    public Login() {
        nama = "Fathur riski";
        username = "fatur";
        password = "ryu12345";
    }
    public String getUsername(){
        return username;
    }
    public void setUsername(){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(){
       this.password = password;
    }
    boolean CekLogin(String Username, String password){
        if(username.equals(getUsername())&& password.equals(getPassword())){
            return true;
        }
        return false;
    }
}
