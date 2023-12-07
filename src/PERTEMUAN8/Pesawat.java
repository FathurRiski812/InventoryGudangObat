/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN8;

/**
 *
 * @author Fatur Riski
 */
public class Pesawat extends kendaraan implements Berjalan,terbang{
    public Pesawat(String merek){
        super(merek);
    }
    
    @Override
    void carabergerak(){
        System.out.println("Pesawat bergerak dalam udara dengan menggunakan mesin-mesin yang memungkinkan untuk terbang");
    }
    
    void kecepatanMax(){
        System.out.println("900 km/h");
    }
    public void berjalan(){
    System.out.println("Pesawat" + getMerek()+"berjalan maju melalui roda yang bersentuhan dengan permukaan tanah");
}    
    public void terbang(){
    System.out.println("Pesawat" + getMerek()+ "mesin yang berkecapatan tinggi,baling2 dan sayap aerodinamic memungkinkan untuk lepas landas, terbang");
}

    @Override
    void kecepatan() {
        System.out.println("900 km/h");
                }
}
