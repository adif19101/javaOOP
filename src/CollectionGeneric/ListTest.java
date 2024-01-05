/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionGeneric;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class ListTest {
    public static void main(String[] args) {
        //String adalah penggunaan generic
        List<String> list = new ArrayList<String>();
        
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("z");
        
        System.out.println("isi dari list : ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("index ke-" + i + ":" + list.get(i));
        }
    }
}
