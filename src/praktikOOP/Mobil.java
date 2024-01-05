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
public class Mobil {
    int kecepatan = 0;
    public void tambahKecepatan(int tambah){
        kecepatan = kecepatan+tambah;
    }
    
    public void kurangiKecepatan(int kurang){
        kecepatan = kecepatan-kurang;
    }
    
    public int tampil(){
        return kecepatan;
    }
}
