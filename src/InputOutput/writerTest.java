/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class writerTest {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
            writer.write("Hello World ini file text saya \n");
//            menulis text dalam file
            writer.flush();
            writer.write("ini baris dua \n");
//            jangan lupa untuk selalu memanggil close
//            setelah writer tidak digunakan
//            close juga sekalipun memanggil flush dan menulis data dalam file
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
