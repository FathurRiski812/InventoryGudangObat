/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TUGASPRAKOOP;



/**
 *
 * @author Fatur Riski
 */
public class CLIOBAT {
    public static void main(String[] args) {
        ATP1 obt = new ATP1();
        obt.datakodeobat("10");
        obt.dataNamaobat("Paracetamol");
        obt.datajenisobat("pereda nyeri(Analgesik)");
        obt.datajumlahstok("20 kaplet");
        obt.datahargaproduksi("2000");
        obt.datahargajual("5000");
        obt.datatanggalexpired("12 desember 2023");
        System.out.println("Gudang Obat");
        System.out.println("----------------------");
        System.out.println("Kode Obat            : " +obt.kodeobat);
        System.out.println("Nama Obat          : " +obt.namaobat);
        System.out.println("Jenis Obat   : "+obt.jenisobat);
        System.out.println("Jumlah Stok           : " +obt.jumlahstok);
        System.out.println("Harga Produksi        : " +obt.hargaproduksi);
        System.out.println("Harga Jual          : " +obt.hargajual);
        System.out.println("Tanggal Expired          : " +obt.tanggalexpired);
    }
}
