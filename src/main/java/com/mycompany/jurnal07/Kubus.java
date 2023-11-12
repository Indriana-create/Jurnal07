/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jurnal07;

/**
 *
 * @author noviyantiindriana
 */
public class Kubus extends Bentuk implements BangunRuang {
    private int sisi;

    public Kubus(String name, int sisi) {
        super(name);
        this.sisi = sisi;
    }

    @Override
    public double hitungLuasPermukaan() {
        double LuasPermukaan = 6 * (sisi * sisi);
        return LuasPermukaan;
    }

    @Override
    public double hitungVolume() {
        double Volume = sisi * sisi * sisi;
        return Volume;
    }
    
    @Override
    public void info() {
        System.out.println("\nNama Kubus      : "+nama);
        System.out.println("Panjang Sisi    : "+ sisi);
    }
    
}
