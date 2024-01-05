/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class readerTest {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("newfile1.txt"));
            String line;
            while((line = reader.readLine()) !=null ){
                System.out.println(line + "\n");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
