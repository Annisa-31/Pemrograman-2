package pertemuan2.console;

import pertemuan2.console.Penjualan;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Annisa Zahra Zahira
 */
public class MainPenjualan {
     public static void main(String[] args) {

        Penjualan p1 = new Penjualan("Boneka Tata", 150000, 2);
        Penjualan p2 = new Penjualan("Boneka Cooky", 120000, 1);
        Penjualan p3 = new Penjualan("Boneka Chimmy", 130000, 3);
        Penjualan p4 = new Penjualan("Boneka RJ", 140000, 2);

        p1.tampilkanData();
        p2.tampilkanData();
        p3.tampilkanData();
        p4.tampilkanData();
    }
}
