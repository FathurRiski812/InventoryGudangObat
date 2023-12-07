/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fatur Riski
 */
public class PRAKOOP1 {
     public static void main(String[] args) {
        kendaraan mobil = new kendaraan();
        mobil.nama = "mobil";
        mobil.warna = "merah";
        mobil.merk = "toyota";
        System.out.println("Nama Kendaraan : " + mobil.nama);
        System.out.println("Warna kendaraan : " + mobil.warna);
        System.out.println("merek kendaraan : " + mobil.merk);
        System.out.println("jumlah roda : " + mobil.jmlroda(4)+ "\n");
        System.out.println("Cara kendaraan bergerak");
        System.out.println("Saat Maju : ");
        mobil.kendaraanmaju();
        System.out.println("Saat Mundur : ");
        mobil.kendaraanmundur();
        System.out.println("Saat Berhenti : " + mobil.nama);
        mobil.kendaraanberhenti();
    }
    
}
