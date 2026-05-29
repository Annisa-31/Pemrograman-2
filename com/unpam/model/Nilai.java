/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unpam.model;

/**
 *
 * @author Annisa Zahra Zahira
 */
public class Nilai {
    private String nim;
    private String kodeMataKuliah;
    private double nilaiTugas;
    private double nilaiUTS;
    private double nilaiUAS;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKodeMataKuliah() {
        return kodeMataKuliah;
    }

    public void setKodeMataKuliah(String kodeMataKuliah) {
        this.kodeMataKuliah = kodeMataKuliah;
    }
    public double getNilaiTugas() {
        return nilaiTugas;
    }

    public void setNilaiTugas(double nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    public double getNilaiUTS() {
        return nilaiUTS;
    }

    public void setNilaiUTS(double nilaiUTS) {
        this.nilaiUTS = nilaiUTS;
    }

    public double getNilaiUAS() {
        return nilaiUAS;
    }

    public void setNilaiUAS(double nilaiUAS) {
        this.nilaiUAS = nilaiUAS;
    }
}
