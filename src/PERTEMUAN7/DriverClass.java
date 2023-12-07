/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN7;

/**
 *
 * @author Fatur Riski
 */
public class DriverClass {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        Buah Apel = new Apel();
        Buah Pisang = new Pisang();
        
        manusia.MakanBuah(Apel);
        manusia.MakanBuah(Pisang);
    }
}
