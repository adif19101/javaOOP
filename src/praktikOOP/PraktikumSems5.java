/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikOOP;

/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class PraktikumSems5 {
    public static void main(String[] args) {
        PersonDaoImpl prs = new PersonDaoImpl();
        Person baru = new Person();
        baru.setId("12");
        baru.setNama("bambang");
        baru.setUmur(15);
        
        prs.save(baru);
    }
   
}
