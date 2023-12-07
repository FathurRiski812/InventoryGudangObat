/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fatur Riski
 */
public class CLI_CetakKTM {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.dataNIM("2218105");
        mhs.dataNama("Fathur Riski");
        mhs.datajeniskelamin("Laki-Laki");
        mhs.dataprodi("TI");
        mhs.dataangkatan("2022");
        mhs.dataalamat("Pakis");
        System.out.println("KTM ITN Malang");
        System.out.println("----------------------");
        System.out.println("NIM             : " +mhs.cetakNIM());
        System.out.println("Nama            : " +mhs.cetaknama());
        System.out.println("Jenis Kelamin   : "+mhs.cetakjeniskelamin());
        System.out.println("Prodi           : " +mhs.cetakprodi());
        System.out.println("Angkatan        : " +mhs.cetakangkatan());
        System.out.println("Alamat          : " +mhs.cetakalamat());
    }
}
