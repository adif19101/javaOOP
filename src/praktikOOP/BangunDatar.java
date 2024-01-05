/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikOOP;

/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class BangunDatar {
    int panjang, lebar, luas, keliling;
    
    public int hitungLuas(int panjang, int lebar){
        luas = panjang*lebar;
        return luas;
    }
    
    public int hitungLuas(int panjang){
        luas = panjang*panjang;
        return luas;
    }
    
    public int hitungKeliling(int panjang, int lebar){
        keliling = 2*(panjang+lebar);
        return keliling;
    }
    
    public int hitungKeliling(int panjang){
        keliling = 4*panjang;
        return keliling;
    }
}
