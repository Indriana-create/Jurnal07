/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jurnal07;

/**
 *
 * @author noviyantiindriana
 */
public class Lingkaran extends Bentuk implements BangunDatar {
    private int jari_jari;

    public Lingkaran(String name, int jari_jari) {
        super(name);
        this.jari_jari = jari_jari;
    }

    @Override
    public double hitungKeliling() {
        double Keliling = 2 * 3.14 * jari_jari;
        long Keliling2 = Math.round(Keliling);
        return Keliling2;
    }

    @Override
    public double hitungLuas() {
        double Luas = 3.14 * (jari_jari * jari_jari);
        long Luas2 = Math.round(Luas);
        return Luas2;
    }
    
    @Override
    public void info() {
        System.out.println("\nNama Lingkaran        : "+ nama);
        System.out.println("Panjang Jari - Jari   : "+ jari_jari);
    }
    
}
