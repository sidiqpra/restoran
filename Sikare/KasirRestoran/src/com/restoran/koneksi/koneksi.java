/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.restoran.koneksi;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author sidiq_pra
 */
public class koneksi {
    private static Connection con;
    public koneksi(){
    }
    public static Connection getConnection(){
         try{
    con=DriverManager.getConnection("jdbc:mysql://localhost/restoran","root","");
    }
    catch(SQLException e){
        JOptionPane.showMessageDialog(null,"Gagal Koneksi");
    }
return con;
  }
}