/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionGeneric;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class NomorHp {
    private String nomor, lanjut;
    
    public String getNomor(){
        return nomor;
    }
    
    public String getLanjut(){
        return lanjut;
    }
    
    public void setNomor(String nomor){
        this.nomor = nomor;
    }
    
    public void setLanjut(String lanjut){
        this.lanjut = lanjut;
    }
    
    public static void main(String[] args) {
        List<String> nope = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        NomorHp hp = new NomorHp();
        
        System.out.println("Pendataan Nomor HP untuk Bantuan Kuota");
        
        do {
            System.out.println("");
            System.out.print("Nomor HP : ");
            hp.setNomor(in.nextLine());
            nope.add(hp.getNomor());
            System.out.print("Lanjut? [y/n] ");
            hp.setLanjut(in.nextLine());
            
        } while (hp.getLanjut().equals("y"));
        
        System.out.println("\nHasil Input :");
        for (int i = 0; i < nope.size(); i++) {
            System.out.println(nope.get(i));
        }
        
        Collections.sort(nope);
        System.out.println("\nHasil Input Setelah di Sort :");
        for (int i = 0; i < nope.size(); i++) {
            System.out.println(nope.get(i));
        }
    }
}
