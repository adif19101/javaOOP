/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InputOutput;

import java.io.File;
import java.io.IOException;
/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class fileTest {
    public static void main(String[] args) {
        File f = new File("newfile.txt");
        if (!f.exists()) {
            try {
                f.createNewFile();
                System.out.println(f.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
        File folder = new File("TestFolder");
        if (!folder.exists()) {
            folder.mkdir();
        }
        File currentFolder = new File(System.getProperty("user.dir"));
        File[] siblings = currentFolder.listFiles();
        for (int i = 0; i < siblings.length; i++) {
            File sibling = siblings[i];
            if (sibling.isFile()) {
                System.out.println("f "+ sibling.getName());
            } else {
                System.out.println("d "+ sibling.getName());
            }
        }
    }
}
