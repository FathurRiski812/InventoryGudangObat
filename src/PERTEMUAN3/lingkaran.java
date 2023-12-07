/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN3;

/**
 *
 * @author Fatur Riski
 */
public class lingkaran {
    int r;
    double phi,luas;
    
    public lingkaran(int r){
        r = 7;
        phi = 3.14;
    }
    void deskripsi(){
        System.out.println("Ini adalah hasil menghitung");
    }
    double hitluaslingkaran(){
        luas=(phi*r*r);
        return luas;
   
        }
    }

