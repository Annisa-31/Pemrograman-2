/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import koneksi.Koneksi;
/**
 *
 * @author Annisa Zahra Zahira
 */
public class CustomerController {
    Connection con;
    PreparedStatement pst;

    public void simpanCustomer(String idCustomer,
                               String namaCustomer,
                               String alamat) {

        try {

            Koneksi koneksi = new Koneksi();
            con = koneksi.getConnection();

            String sql = "INSERT INTO customer VALUES (?,?,?)";

            pst = con.prepareStatement(sql);

            pst.setString(1, idCustomer);
            pst.setString(2, namaCustomer);
            pst.setString(3, alamat);

            pst.executeUpdate();

            System.out.println("Data Customer Berhasil Disimpan");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }
}
