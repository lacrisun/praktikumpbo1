/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.praktikumpbo3;

/**
 *
 * @author kitsunne
 */
import java.util.Scanner;

public class KalkulatorBalok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== KALKULATOR BANGUN RUANG =====");
        System.out.print("Panjang Balok (cm) : ");
        double panjang = sc.nextDouble();
        System.out.print("Lebar Balok (cm) : ");
        double lebar = sc.nextDouble();
        System.out.print("Tinggi Balok (cm) : ");
        double tinggi = sc.nextDouble();

        // Menghitung luas permukaan balok
        double luasBalok = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);

        // Menghitung volume balok
        double volumeBalok = panjang * lebar * tinggi;

        // Menampilkan output
        System.out.printf("Informasi Balok :\nPanjang = %.1f cm\nLebar = %.1f cm\nTinggi = %.1f cm\n", panjang, lebar, tinggi);
        System.out.printf("Luas Balok = %.1f cm²\n", luasBalok);
        System.out.printf("Volume Balok = %.1f cm³\n", volumeBalok);

        sc.close();
    }
}
