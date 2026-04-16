/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2.console;

/**
 *
 * @author Annisa Zahra Zahira
 */
public class Penjualan {
    String namaBarang;
    int harga;
    int jumlah;

    public Penjualan(String namaBarang, int harga, int jumlah) {
        this.namaBarang = namaBarang;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public int hitungTotal() {
        return harga * jumlah;
    }

    public void tampilkanData() {
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga       : " + harga);
        System.out.println("Jumlah      : " + jumlah);
        System.out.println("Total       : " + hitungTotal());
        System.out.println("----------------------");
    }
}
