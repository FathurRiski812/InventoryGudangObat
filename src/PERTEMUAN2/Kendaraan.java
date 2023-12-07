/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN2;

/**
 *
 * @author Fatur Riski
 */
public class Kendaraan {
    String nama,warna,pabrikan;
    int speed;
    
    public Kendaraan(){
    this.nama = "Vios";
    this.warna = "Silver";
    this.pabrikan = "Toyota";
    this.speed = 200;

    }
    void kendaraanMaju(){
        System.out.println("Berjalan maju");
    }
    void kendaraanMundur(){
        System.out.println("Berjalan mundur");
    }
    void kendaraanBerhenti(){
        System.out.println("Berjalan Berhenti");
    }
    
     public static void main(String[] args){
        Kendaraan mobil = new Kendaraan();
        System.out.println("Nama Kendaraan : "+mobil.nama);
         System.out.println("Warna Kendaraan : "+mobil.warna);
          System.out.println("Pabrikan kendaraan : "+mobil.pabrikan);
           System.out.println("kecepatan maksimal : "+mobil.speed + "km/jam \n");
            System.out.println("cara kendaraan bergerak : : ");
             System.out.println("saat maju:");
             mobil.kendaraanMaju();
             System.out.println("saat mundur:");
             mobil.kendaraanMundur();
             System.out.println("saat berhebti:");
             mobil.kendaraanBerhenti();
             
}


   
        
    
}

