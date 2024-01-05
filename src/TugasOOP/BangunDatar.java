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
public class BangunDatar {
    int panjang, lebar, sisi, alas, luas, keliling;
    double kelilingD, luasD, tinggi, r;
    final double pi = 3.14;
    
    public int hitLuas(int sisi){
        luas = sisi*sisi;
        return luas;
    }
    
    public int hitKel(int sisi){
        keliling = 4*sisi;
        return keliling;
    }
    
    public int hitLuas(int panjang, int lebar){
        luas = panjang*lebar;
        return luas;
    }
    
    public int hitKel(int panjang, int lebar){
        keliling = (panjang+lebar)*2;
        return keliling;
    }
    
    public double hitLuas(int alas, double tinggi){
        luasD = (alas*tinggi)/2;
        return luasD;
    }
    
    public int hitKel(int sisi, int panjang, int lebar){
        keliling = sisi+panjang+lebar;
        return keliling;
    }
    
    public double hitLuas(double r){
        luasD = pi*r*r;
        return luasD;
    }
    
    public double hitKel(double r){
        kelilingD = pi*(r+r);
        return kelilingD;
    }
    
    public double hitLuas(double tinggi ,int alas){
        luasD = tinggi*alas;
        return luasD;
    }
    
    public int hitKel(int panjang, int lebar, double tinggi){
        keliling = 2*(panjang+lebar);
        return keliling;
    }
}
