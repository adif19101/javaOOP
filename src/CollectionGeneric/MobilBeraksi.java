/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionGeneric;

/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class MobilBeraksi {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil(1001,"Toyota");
        Mobil mobil2 = new Mobil(1002,"Avanza");
        Mobil mobil3 = new Mobil(1003,"BMW");
        Mobil mobil4 = new Mobil(1002,"Avanza");
        
        System.out.println(mobil1.equals(mobil2));
        System.out.println(mobil2.equals(mobil4));
        System.out.println(mobil2==mobil4);
    }
}
