/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.praktikumpbo3;

/**
 *
 * @author kitsunne
 */
public class Enumeration {
    public static void main(String[] args) {
        // Deklarasi Enumerasi
        enum Hari {
            SENIN, SELASA, RABU, KAMIS, JUMAT, SABTU, MINGGU
        }

        Hari hariIni = Hari.KAMIS;

        if (hariIni == Hari.KAMIS) {
            System.out.println("Hari ini adalah Hari KAMIS!");
            System.out.println("Besok adalah " + Hari.JUMAT);
        }
    }
}

