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
public class Karyawan {
    String nik, nama, info;
    int jamKerja,gaji;
    
    public int hitungGaji(int jam){
        gaji = 50000*jam;
        return gaji;
    }
    
    public void isiData(String nik, String nama, int gaji){
        this.nik = nik;
        this.nama = nama;
        this.gaji = gaji;
    }
    
    public String tampil(){
        info = "NIK: "+nik+", Nama: "+nama+", Gaji: "+String.valueOf(gaji);
        return info;
    }
}
