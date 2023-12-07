/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN8;

/**
 *
 * @author Fatur Riski
 */
public class Mobil extends kendaraan implements Berjalan{
    public Mobil(String merek){
        super(merek);
    }
   @Override
   void carabergerak(){
       System.out.println("bergerak melaju melalui roda yang bersentuhan langsung dengan permukaan tanah");
   }
   

   void kecepatanMax(){
       System.out.println("500m/h");
   }
   
   @Override
   public void berjalan(){
       System.out.println("Mobil" + getMerek() + "sedang berjalan dijalan raya");
   }

    @Override
    void kecepatan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}
