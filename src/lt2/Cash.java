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
public class Cash implements dapatKembalian{


    public double kembalian(double total, double jmlUang) {
        double jmlkemb;
        jmlkemb = jmlUang - total;
        return jmlkemb;
    }
    
    
}
