/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jurnal07;

/**
 *
 * @author noviyantiindriana
 */
public class Jurnal07 {

    public static void main(String[] args) {
        Kubus K = new Kubus("Kiub", 5);
        Lingkaran L = new Lingkaran("Sirkel", 14);
        PersegiPanjang PP = new PersegiPanjang("Rektenggel", 8, 9);
        PrismaSegi3 PS3 = new PrismaSegi3("Traienggel Prism", 6, 7, 10);
        L.info();
        System.out.println("Luas                  : "+L.hitungLuas());
        System.out.println("Keliling              : "+L.hitungKeliling());
        PP.info();
        System.out.println("Luas                  : "+PP.hitungLuas());
        System.out.println("Keliling              : "+PP.hitungKeliling());
        K.info();
        System.out.println("Luas Permukaan  : "+K.hitungLuasPermukaan());
        System.out.println("Volume          : "+K.hitungVolume());
        PS3.info();
        System.out.println("Luas Permukaan  : "+PS3.hitungLuasPermukaan());
        System.out.println("Volume          : "+PS3.hitungVolume());
    }
}
