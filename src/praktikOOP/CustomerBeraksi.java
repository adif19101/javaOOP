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
public class CustomerBeraksi {
    public static void main(String[] args) {
        MemberCustomer mc = new MemberCustomer();
        mc.setId(1234L);
        Long idMember = mc.getId();
        System.out.println("Id Member Customer Adalah : " + idMember);
    }
}
