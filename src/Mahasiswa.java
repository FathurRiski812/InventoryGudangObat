/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fatur Riski
 */
public class Mahasiswa {
    String nim ,nama ,jeniskelamin,prodi,angkatan,alamat;
    void dataNIM(String Nim){
        this.nim = Nim;
    }
    void dataNama(String Nama){
        this.nama = Nama;
    }
    void datajeniskelamin(String jeniskelamin){
        this.jeniskelamin = jeniskelamin;
    }
    void dataprodi(String prodi){
        this.prodi = prodi;
    }
    void dataangkatan(String angkatan){
        this.angkatan = angkatan;
    }
    void dataalamat(String alamat){
        this.alamat = alamat;
    }
    String cetakNIM(){
        return nim;
    }
    String cetaknama(){
        return nama;
    }
    String cetakjeniskelamin(){
        return jeniskelamin;
    }
    String cetakprodi(){
        return prodi;
    }
    String cetakangkatan(){
        return angkatan;
    }
    String cetakalamat(){
        return alamat;
    }
}
    
