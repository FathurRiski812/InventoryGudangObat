/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASPRAKOOP;

/**
 *
 * @author Fatur Riski
 */
public class ATP1 {
    String kodeobat,namaobat ,jenisobat,jumlahstok,hargaproduksi,hargajual,tanggalexpired;
    String InputNama;
    String Nama1 = "paracetamol";
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
    String CocokKode(String InputNama){
        if(InputNama.equals("paracetamol")){
            kodeobat = "prctml10"; 
        }
        else if(InputNama.equals("amoxillin")){
            kodeobat = "amxln11";
        }
        else if(InputNama.equals("polysilane")){
            kodeobat = "plyln12";
        }
        return kodeobat;
    }
    
    String cetakData(){
        String hasil = "";
        hasil += "Nama Obat          : "+ namaobat+"\n";
        hasil += "Kode Obat          : "+ CocokKode(namaobat)+"\n";
        hasil += "Jenis Obat           : "+ jenisobat+"\n";
        hasil += "Jumlah Stok         : "+ jumlahstok+"\n";
        hasil += "Harga Produksi   : "+ hargaproduksi+ "\n";
        hasil += "Harga Jual           : "+ hargajual+"\n";
        hasil += "Tanggal Expired  : "+ tanggalexpired+"\n";
        return hasil;
    }
    
    String cetakData(String pajak){
        String hasil = "";
        hasil += "Nama Obat          : "+ namaobat+"\n";
        hasil += "Kode Obat          : "+ CocokKode(namaobat)+"\n";
        hasil += "Jenis Obat           : "+ jenisobat+"\n";
        hasil += "Jumlah Stok         : "+ jumlahstok+"\n";
        hasil += "Harga Produksi   : "+ hargaproduksi+ "\n";
        hasil += "Harga Jual           : "+ hargajual+"\n";
        hasil += "Pajak              : "+ pajak+"\n";
        hasil += "Tanggal Expired  : "+ tanggalexpired+"\n";
        return hasil;
    }
}
