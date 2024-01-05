/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktik1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class ThrowsExceptionTest {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        FileInputStream file = new FileInputStream("baca-file.txt");
        System.out.println("buka file");
    }
}
