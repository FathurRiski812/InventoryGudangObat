/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN4;

/**
 *
 * @author Fatur Riski
 */
public class mainGaji {
    public static void main(String[] args) {
       pembayaranGaji Gaji = new pembayaranGaji();
       Gaji.setInput("G12345");
       System.err.println("Rekening yang anda masukkan :"+Gaji.getInput());
        System.err.println("Jumlah saldo anda : "+Gaji.cekSaldo());
    }
}
