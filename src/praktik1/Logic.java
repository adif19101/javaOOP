/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktik1;

/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class Logic {
    public static void main(String args[]){
         
        boolean a = true;
        boolean b = false;
        boolean hasil;

        hasil = a && a;
        System.out.println("Hasil dari a && a : " + hasil );   

        hasil = a && b;
        System.out.println("Hasil dari a && b : " + hasil );  

        hasil = a || b;
        System.out.println("Hasil dari a || b : " + hasil );   

        hasil = b || b;
        System.out.println("Hasil dari b || b : " + hasil );   

        hasil = !a;
        System.out.println("Hasil dari !a : " + hasil );  

        hasil = !b;
        System.out.println("Hasil dari !b : " + hasil );  
      
  }
}
