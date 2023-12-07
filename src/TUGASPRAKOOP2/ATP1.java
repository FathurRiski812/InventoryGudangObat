/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASPRAKOOP2;

import TUGASPRAKOOP.*;

/**
 *
 * @author Fatur Riski
 */
public class ATP1 {
    public ATP1(String kodeobat,String namaobat ,String jenisobat,String jumlahstok,String hargaproduksi,String hargajual,String tanggalexpired)
    {
       this.kodeobat = kodeobat;
       this.namaobat = namaobat;
       this.jenisobat = jenisobat;
       this.jumlahstok = jumlahstok;
       this.hargaproduksi = hargaproduksi;
       this.hargajual = hargajual;
       this.tanggalexpired = tanggalexpired; 
    }
    String kodeobat,namaobat ,jenisobat,jumlahstok,hargaproduksi,hargajual,tanggalexpired;
    void datakodeobat(String kodeobat ){
        this.kodeobat = kodeobat;
    }
    void dataNamaobat(String Namaobat){
        this.namaobat = Namaobat;
    }
    void datajenisobat(String jenisobat){
        this.jenisobat = jenisobat;
    }
    void datajumlahstok(String jumlahstok){
        this.jumlahstok = jumlahstok;
    }
    void datahargaproduksi(String hargaproduksi){
        this.hargaproduksi = hargaproduksi;
    }
    void datahargajual(String hargajual){
        this.hargajual = hargajual;
    }
    void datatanggalexpired(String tanggalexpired){
        this.tanggalexpired = tanggalexpired;
    }
    String cetakkodeobat(){
        return namaobat;
    }
    String cetakNamaobat(){
        return namaobat;
    }
    String cetakjenisobat(){
        return jenisobat;
    }
    String cetakjumlahstok(){
        return jumlahstok;
    }
    String cetakhargaproduksi(){
        return hargaproduksi;
    }
    String cetakhargajual(){
        return hargajual;
    }
    String cetaktanggalexpired(){
        return tanggalexpired;
    }
}
