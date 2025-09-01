/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.kelompok2.gustipanjiwidodo;

/**
 *
 * @author desktop
 */
public class GustiPanjiWidodo {

    public static void main(String[] args) {
        String nama = "Gusti Panji Widodo"; // Nama dalam bentuk String
        final long NIM = 2407113145L; // Konstanta NIM dalam bentuk tipe data long
        short umur = 19; // Umur dalam bentuk short
        double IP = 3.70; // IP dalam bentuk double
        String alamat = "Jl. Suka Karya"; // Alamat dalam bentuk String
        String golonganDarah = "O"; // Golongan Darah dalam bentuk String
        
        byte byteNIM = (byte) NIM; // Konversi IP (tipe long) ke tipe data byte (explicit casting)
        
        // Menampilkan semua variabel ke console/output dengan System.out.println();
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Umur : " + umur);
        System.out.println("IP : " + IP);
        System.out.println("Alamat : " + alamat);
        System.out.println("Golongan darah : " + golonganDarah + "\n");
        
        System.out.println("IP yang diubah ke byte : " + byteNIM);
    }
}
