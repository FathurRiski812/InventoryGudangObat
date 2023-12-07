/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN3;

/**
 *
 * @author Fatur Riski
 */
public class tabung extends lingkaran{
    int t;
    double volume,luaspermukaan;
    
    public tabung(int r,int t){
        super(r);
        this.t = t;
    }
    void keterangan(){
        deskripsi();
        System.out.println("menghitung volume tabung ");
    }
    double hitvolumetabung(){
        volume = (hitluaslingkaran()*t);
        return volume;
    }
}
