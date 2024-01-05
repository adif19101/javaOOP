/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasOOP;

/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class BangunRuang extends BangunDatar{
    int volume, tAlas;
    double volumeD;
    
    public int hitVol(int sisi){
//        kubus
        volume = sisi*sisi*sisi;
        return volume;
    }
    
    public int hitVol(int panjang, int lebar, int tinggi){
//        balok
        volume = panjang*lebar*tinggi;
        return volume;
    }
    
    public double hitVol(int alas, int tinggi, double tAlas){
//      prisma segitiga
        volumeD = ((alas*tAlas)/2)*tinggi;
        return volumeD;
    }
    
    public double hitVol(double r, int tinggi){
//      tabung
        volumeD = pi*r*r*tinggi;
        return volumeD;
    }
}
