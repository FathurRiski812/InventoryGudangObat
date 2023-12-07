/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASPRAKOOP5;

/**
 *
 * @author Fatur Riski
 */
public class PajakPersen extends ATP1 {
    int pajakPersen;
   @Override
   int hitungPajak(){
       int harga = Integer.parseInt(hargajual);
               
       harga = (harga * pajakPersen / 100);
       pajak = harga;
       
       return harga;
   }
}
