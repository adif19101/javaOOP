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
public class PersonDaoImpl implements PersonDao{
    public void save(Person p){
        System.out.println("Menyimpan Person");
    }
    public void delete(Person p){
        System.out.println("Menghapus Person");
    }
    public Person getById(String id){
        Person p = new Person();
        p.setId(id);
        p.setNama("abc");
        return p;
    }
}
