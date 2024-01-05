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
public class PassByValue {
    public static void ubahNama(String nama, Integer id){
        nama = "dian";
        id = 123;
        System.out.println("nama baru di dalam method: " + nama);
        System.out.println("id baru di dalam method: " + id);
    }
    public static void main(String[] arg){
        String nama = "ifnu";
        Integer id = 456;
        System.out.println("nama lama dari method main: " + nama);
        System.out.println("id lama dari method main: " + id);
        ubahNama(nama,id);
        System.out.println("nama lama dari method main: " + nama);
        System.out.println("id lama dari method main: " + id);
    }
}
