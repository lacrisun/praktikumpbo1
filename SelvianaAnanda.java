/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.selviana_ananda;

/**
 *
 * @author kitsunne
 */
public class SelvianaAnanda {
    public static void main(String[] args) {
        String nama = "Selviana Ananda"; // Nama dalam bentuk String
        final long NIM = 2407112863L; //Konstanta NIM dalam bentuk tipe data long
        short umur = 18; // Umur dalam beentuk short
        double IP = 3.86; // IP dalam bentuk double
        String alamat = "Jl. Jendral Sudirman"; // Alamat dalam bentuk String
        String golonganDarah = "A"; // Golongan Darah dalam bentuk String
  
        byte byteNIM = (byte) NIM; // Konversi IP (tipe long) ke tipe  data byte (explicit casting)
    
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

