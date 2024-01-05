/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionGeneric;

/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class ToStringTest {
    
    @Override
    public String toString(){
        return "ini toString dari class ToStringTest";
    }
    
    public static void main(String[] args) {
        ToStringTest test = new ToStringTest();
        System.out.println("implementasi toString dari class object " + "menghasilkan : " + test);
    }
}
