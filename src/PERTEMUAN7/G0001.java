/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN7;

/**
 *
 * @author Fatur Riski
 */
public class G0001 extends Pembayaran{
    public String nama,alamat;
    public int saldo;
    public String kode;
    double diskon,bayar,total;
    public G0001(){
        this.nama = "Fathur Riski";
        this.kode = "G0001";
        this.saldo = 500000;
        this.alamat = "Malang, SumberKradenan Pakis";
    }

    @Override
    double hitPembayaran(double bayar) {
        diskon = bayar*diskon;
        total = bayar-diskon;
        return total;
      }
    double potSaldo(){
        return this.saldo-total;
    }

    @Override
    double cekKode(String input) {
        if(input.compareTo(kode)==0){
        diskon =0.2;
    }else{
            diskon=0;
        }
        return diskon;
    }
    @Override
    void tampilkanMember() {
        System.out.println("Member G0001 dengan diskon 20%");
     }
    
}