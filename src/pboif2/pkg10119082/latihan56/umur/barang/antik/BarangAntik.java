/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119082.latihan56.umur.barang.antik;

/**
 *
 * @author Zainul Rifqi
 * NAMA     : Zainul Rifqi Muwaffaq
 * KELAS    : IF2
 * NIM      : 10119082
 * Deskripsi: Barang Antik
 */
public class BarangAntik {
    int umur;

    public BarangAntik(int umur) {
        this.umur = umur;
    }
    
    public void tampillUmur() {
        System.out.println("Umur barang antik ini adalah : " + umur + " tahun.");
    }
}
