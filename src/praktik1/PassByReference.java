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
public class PassByReference {
    public static void ubahNama(String[] nama, Integer[] id){
        nama[0] = "dian";
        id[0] = 888;
        System.out.println("nama baru di dalam method: " + nama[0]);
        System.out.println("id baru di dalam method: " + id[0]);
    }
    public static void main(String[] arg){
        String[] nama = new String[1];
        Integer[] id = new Integer[1];
        nama[0] = "ifnu";
        id[0] = 777;
        System.out.println("nilai lama dari method main: " + nama[0]);
        System.out.println("id lama dari method main: " + id[0]);
        ubahNama(nama, id);
        System.out.println("nilai lama dari method main: " + nama[0]);
        System.out.println("id lama dari method main: " + id[0]);
    }
}
