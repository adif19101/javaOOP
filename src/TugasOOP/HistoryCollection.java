/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasOOP;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class HistoryCollection {
    List<String> list = new ArrayList<String>();
    String garis = "---------------------------------------------";
    
    public void listTambah(String nama, String param1, String param2, String param3, String hasil1, String hasil2, String hasil3){
        list.add(garis);
        list.add(nama);
        list.add(param1);
        list.add(param2);
        list.add(param3);
        list.add(hasil1);
        list.add(hasil2);
        list.add(hasil3);
    }
    
    public void listTambah(String nama, String param1, String param2, String hasil1, String hasil2, String hasil3){
        list.add(garis);
        list.add(nama);
        list.add(param1);
        list.add(param2);
        list.add(hasil1);
        list.add(hasil2);
        list.add(hasil3);
    }
    
    public void listTambah(String nama, String param1, String hasil1, String hasil2, String hasil3){
        list.add(garis);
        list.add(nama);
        list.add(param1);
        list.add(hasil1);
        list.add(hasil2);
        list.add(hasil3);
    }
    
}
