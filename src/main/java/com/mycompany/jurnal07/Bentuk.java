/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jurnal07;

/**
 *
 * @author noviyantiindriana
 */
public abstract class Bentuk {
    String nama;

    public Bentuk(String name) {
        this.nama = name;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public abstract void info(); 
    
}
