/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.pbopraktikum4;

import java.util.Scanner;

/**
 *
 * @author desktop
 */
public class LatihanSoal {
    public static void main(String[] args) {
        boolean on = true;
        
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("== KALKULATOR LUAS BANGUN DATAR ==");
            System.out.println("1. Persegi");
            System.out.println("2. Lingkaran");
            System.out.println("3. Segitiga");
            String pilihan = sc.nextLine();

            switch (pilihan) {
                case "1":
                    System.out.println("== Persegi ==");
                    System.out.print("Masukkan jumlah ukuran sisi (cm) : ");
                    double ukuranSisi = sc.nextDouble();
                    double luasPersegi = ukuranSisi * ukuranSisi;
                    System.out.println("Luas persegi kamu : " + luasPersegi + "cm²");
                    sc.nextLine();
                    break;
                case "2":
                    System.out.println("== Lingkaran ==");
                    System.out.print("Masukkan jumlah ukuran jari-jari (cm) : ");
                    final double PI = 3.142;
                    double ukuranRadius = sc.nextDouble();
                    double luasLingkaran = PI * (ukuranRadius * ukuranRadius);
                    System.out.println("Luas lingkaran kamu : " + luasLingkaran + "cm²");
                    sc.nextLine();
                    break;
                case "3":
                    System.out.println("== Segitiga ==");
                    System.out.print("Masukkan jumlah panjang alas (cm) : ");
                    double ukuranAlas = sc.nextDouble();
                    System.out.println("Masukkan jumlah ukuran tinggi (cm) : ");
                    double ukuranTinggi = sc.nextDouble();
                    final double setengah = 0.5;
                    double luasSegitiga = setengah * ukuranAlas * ukuranTinggi;
                    System.out.println("Luas segitiga kamu : " + luasSegitiga + "cm²");
                    sc.nextLine();
                    break;
                default:
                    System.out.println("Salah input!");
                    on = false;
            }
        } while (on);
    }
    
}
