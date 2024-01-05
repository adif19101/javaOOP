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
public class Person {
    private Long id; //instance variable
    private String nama; //instance variable
    private String kelas;
    
    public static void main(String[] args){
        Person ifnu; //local variable/reference variabel ifnu
        Person adif;
        adif = new Person();
        adif.setNama("Adif Fikri");
        ifnu = new Person(); //object Person diinstansiasi
        ifnu.setId(17l);
        ifnu.setNama("ifnu bima");
        ifnu.setKelas("5H");
        Person klonenganIfnu = ifnu; //local variable yang menunjuk ke object
        klonenganIfnu.setNama("klonengan ifnu"); // yang sama
        System.out.println(ifnu.getKelas());
        System.out.println(adif.getNama());
    }
    public void setKelas(String aKelas){
        this.kelas = aKelas;
    }
    public String getKelas(){
        return this.kelas;
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
