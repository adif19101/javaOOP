/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktik1;

/**
 *
 * @author Muhammad Adif Fikri  || 1910631170101
 */
public class Praktik1 {
    private Long id; //instance variable
    private String nama; //instance variable
    public static void main(String[] args){
        Person ifnu; //local variable/reference variabel ifnu
        ifnu = new Person(); //object Person diinstansiasi
        ifnu.setId(17l);
        ifnu.setNama("ifnu bima");
        Person klonenganIfnu = ifnu; //local variable yang menunjuk ke object
        klonenganIfnu.setNama("klonengan ifnu"); // yang sama
    }
    public void setId(Long aId){ //local variable aId
    this.id = aId;
    }
    public Long getId(){
    return this.id;
    }
    public void setNama(String aNama){ //local variable aNama
    this.nama = aNama;
    }
    public String getNama(){
    return this.nama;
    }
}
