/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN6;

/**
 *
 * @author Fatur Riski
 */
public class Gajireward extends gajiabsreward{
    double menit,tunjanganbonus,gajipokok,tunjangananak,anak;
    int waktu;
    
    double lembur(){
        tunjanganbonus = waktu / 60;
        return tunjanganbonus * 25000;
    }
    double tunjanganAnak(){
        if (anak == 0){
            tunjangananak = 0;
           
        }
        else if(anak == 1){
            tunjangananak = gajipokok / 10;
        }
        else{
            tunjangananak = gajipokok / 5;
    }
        return tunjangananak;
    }
}
