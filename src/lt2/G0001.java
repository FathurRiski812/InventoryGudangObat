/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt2;

/**
 *
 * @author Computer6
 */
public class G0001 extends Pembayaran{
    public String inputPinKredit;
    public String nama, alamat, kode;
    public int saldo;
    double diskon, bayar, total;
    public G0001(){
        this.nama = "Nayaka Apta N";
        this.kode = "G0001";
        this.saldo = 500000;
        this.alamat = "Jl Malang Raya 22";
    }
    public double hasil(){
        return diskon;
    }
    
    double cekKode(String input){
        if(input.compareTo(kode)==0){
            diskon = 0.2;
        }
        else{
            diskon = 0;
        }
        return diskon;
    }
    double hitPembayaran(double bayar){
        diskon = bayar * diskon;
        total = bayar - diskon;
        return total;
    }
    double potSaldo(){
        return this.saldo-total;
    }
    void tampilkanMember(){
        System.out.println("Member G0001 dengan diskon 20%");
    }
    void jenisPembayaran(Cash cash){
        if(bayar > total){
            System.out.println("Kembalian : " + cash.kembalian(total, bayar));
        }
        else if(bayar < total){
            System.out.println("uang anda kurang");
        }
        else{
            System.out.println("Pembayaran Berhasil");
        }
    }
    void jenisPembayaran(Emoney emoney){
        emoney.scanQris();
    }
    void jenisPembayaran(Kredit kredit){
        kredit.cekKartuKredit(kode, inputPinKredit);
    }
}
