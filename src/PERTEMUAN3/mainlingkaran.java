/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN3;

/**
 *
 * @author Fatur Riski
 */
public class mainlingkaran {
    public static void main(String[] args) {
        lingkaran lkr = new lingkaran(7);
        lkr.deskripsi();
        System.out.println("Hasilnya adalah "+ lkr.hitluaslingkaran());
        tabung tbg = new tabung(7,20);
        tbg.keterangan();
        System.out.println("Volumenya adalah "+ tbg.hitvolumetabung());
    }
}
