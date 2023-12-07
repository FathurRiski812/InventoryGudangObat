/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN2;

/**
 *
 * @author Fatur Riski
 */
public class DataMatkul {
       String kode_mk, nama_mk, dosen_pengampu;
    int jml_sks, kode;
    
    int kode (){
        Random rndm = new Random();
        kode = rndm.nextInt (10000);
        return kode;
    }
    
    public DataMatkul (){
        this.kode_mk = "IF2112";
        this.nama_mk = "OOP";
        this.dosen_pengampu = "YOSEP";
        this.jml_sks = 3;
    }
}

