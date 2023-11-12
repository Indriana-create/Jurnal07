/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jurnal07;

/**
 *
 * @author noviyantiindriana
 */
public class PersegiPanjang extends Bentuk implements BangunDatar {
    private int lebar;
    private int panjang;

    public PersegiPanjang(String name, int lebar, int panjang) {
        super(name);
        this.lebar = lebar;
        this.panjang = panjang;
    }

    @Override
    public double hitungKeliling() {
        double Keliling = 2 * (panjang + lebar);
        long Keliling2 = Math.round(Keliling);
        return Keliling2;
    }

    @Override
    public double hitungLuas() {
        double Luas = panjang * lebar;
        long Luas2 = Math.round(Luas);
        return Luas2;
    }
    
    @Override
    public void info() {
        System.out.println("\nNama Persegi Panjang  : "+nama);
        System.out.println("Panjang               : "+ panjang);
        System.out.println("Lebar                 : "+ lebar);
    }
    
}
