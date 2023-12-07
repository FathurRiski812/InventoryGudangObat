/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN9EXCEPTION;

/**
 *
 * @author Fatur Riski
 */
public class ThrowsException {
    static void Error() throws ClassNotFoundException{
        throw new ClassNotFoundException("Error sudah saya tangkap");
    }
    public static void main(String[] args) {
        try{
            ThrowsException.Error();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
