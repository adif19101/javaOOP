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
public class ExceptionPertamaTest {
    public static void main(String[] args) {
        try {
            System.out.println("Ini eksekusi pertama");
            throw new ExceptionPertama("ini pesan Exception");
        } catch (ExceptionPertama ex) {
            ex.printStackTrace();
        }finally{
            System.out.println("Kode Selesai");
        }
    }
}
