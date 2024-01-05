/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionGeneric;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class MobilSetTest {
    public static void main(String[] args) {  
        Mobil mobil1 = new Mobil(1001,"Toyota");
        Mobil mobil2 = new Mobil(1002,"Avanza");
        Mobil mobil3 = new Mobil(1003,"BMW");
        Mobil mobil4 = new Mobil(1004,"Avanza");
        
        //////// MAP //////////
        Map<Mobil, Integer> map = new HashMap<>();
        map.put(mobil1,1);
        map.put(mobil2,2);
        map.put(mobil3,3);
        map.put(mobil4,4);
        System.out.println("==============HashMap================");
        for(Mobil key:map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }
        
        ////////// SET ///////////////
        Set<Mobil> set = new HashSet<>();
        set.add(mobil1);
        set.add(mobil2);
        set.add(mobil3);
        set.add(mobil4);
        System.out.println("======HashSet==============");
        System.out.println(set);
        
        
        ////// SORTING LIST ////////
        List<Integer> angkaList = new ArrayList<Integer>();
        angkaList.add(4);
        angkaList.add(3);
        angkaList.add(12);
        angkaList.add(11);
      
        System.out.println("SEBELUM DISORTING : ");
        for(int i=0; i< angkaList.size();i++) {
            System.out.println("index ke-" + i + ":" + angkaList.get(i) );
        }
        
        System.out.println("SETELAH DISROTING : ");
        Collections.sort(angkaList);
        for(int i=0; i< angkaList.size();i++) {
            System.out.println("index ke-" + i + ":" + angkaList.get(i) );
        }
        
    }
}
