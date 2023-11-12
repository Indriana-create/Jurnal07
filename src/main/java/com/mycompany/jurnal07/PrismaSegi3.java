/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jurnal07;

/**
 *
 * @author noviyantiindriana
 */
public class PrismaSegi3 extends Bentuk implements BangunRuang {
    private int alas;
    private int tinggi;
    private int tinggi_prisma;

    public PrismaSegi3(String name, int alas, int tinggi, int tinggi_prisma) {
        super(name);
        this.alas = alas;
        this.tinggi = tinggi;
        this.tinggi_prisma = tinggi_prisma;
    
    }
    
    @Override
    public double hitungLuasPermukaan() {
        double LuasAlas = (alas * tinggi) / 2;
        double KelilingAlas = 3 * alas;
        double LuasPermukaan = (2 * LuasAlas) + (KelilingAlas * tinggi_prisma);
        return LuasPermukaan;
    }

    @Override
    public double hitungVolume() {
        double LuasAlas = (alas * tinggi) / 2;
        double Volume = LuasAlas * tinggi_prisma;
        return Volume;
    }
    
    @Override
    public void info(){
        System.out.println("\nNama Prisma Segitiga : "+nama);
        System.out.println("Panjang Alas    : "+ alas);
        System.out.println("Tinggi Alas     : "+tinggi);
        System.out.println("Tinggi Prisma   : "+tinggi_prisma);
    }
    
}
