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
public interface PersonDao {
    void save(Person p);
    void delete(Person p);
    Person getById(String id);
}
