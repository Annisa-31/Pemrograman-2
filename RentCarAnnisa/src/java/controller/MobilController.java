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
public class MobilController {
    Connection con;
    PreparedStatement pst;

    public void simpanMobil(String kodeMobil,
                            String namaMobil,
                            String harga) {

        try {

            Koneksi koneksi = new Koneksi();
            con = koneksi.getConnection();

            String sql = "INSERT INTO mobil VALUES (?,?,?)";

            pst = con.prepareStatement(sql);

            pst.setString(1, kodeMobil);
            pst.setString(2, namaMobil);
            pst.setString(3, harga);

            pst.executeUpdate();

            System.out.println("Data Mobil Berhasil Disimpan");

        } catch (Exception e) {

            System.out.println(e.getMessage());

        }
    }
}
