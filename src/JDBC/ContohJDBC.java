/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JDBC;

import java.sql.SQLException;


/**
 *
 * @author Muhammad Adif Fikri || 1910631170101
 */
public class ContohJDBC {
    public static void main(String[] args) throws SQLException {
//        koneksi.configDB();
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new viewJDBC().setVisible(true);
            }
        });
    }
}
