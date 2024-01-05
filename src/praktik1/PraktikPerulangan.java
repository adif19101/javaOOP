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
public class PraktikPerulangan {
    public static void main(String[] args) {
        //FOR
        for (int x = 0; x < 10; x++) {
            System.out.println("ini perulangan ke-"+x);
        }
        
        
        //WHILE
        int y = 0;
        while (y<5) {            
            System.out.println("berulang");
            y++;
        }


        //DO-WHILE
        int z = 0;
        do {            
            System.out.println("ini akan berulang");
            z++;
        } while (z <5);
    }
}
