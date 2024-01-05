/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionGeneric;

import java.util.Objects;

/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class Mobil {
    int nomor;
    String namaMerk;
    
    public Mobil(int nomor, String namaMerk){
        this.nomor = nomor;
        this.namaMerk = namaMerk;
    }
    
    public String toString(){
        return "Nomor : " + nomor + " Nama Merek : " + namaMerk;
    }
    
    @Override
    public boolean equals(Object o){
            //jika mobil == objek
            if(this==o){
                return true;
            }
            //jika objek == kosong atau class tidak sama dengan class objek
            if(o==null || getClass() != o.getClass()) {
                return false;
            }

            Mobil mobil = (Mobil) o;
            return nomor == mobil.nomor && Objects.equals(namaMerk,mobil.namaMerk);
        }
    
    @Override
    public int hashCode(){
        return Objects.hash(nomor,namaMerk);
    }
}
