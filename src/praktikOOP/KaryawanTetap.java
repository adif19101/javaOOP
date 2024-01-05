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
public class KaryawanTetap extends Karyawan{
    int tunjangan;
    
    public KaryawanTetap(){
        tunjangan = 500000;
    }
    
    @Override
    public int hitungGaji(int jam){
        gaji = tunjangan+(50000*jam);
        return gaji;
    }
}
