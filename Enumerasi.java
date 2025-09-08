/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.praktikum3oop;

/**
 *
 * @author user
 */
public class Enumerasi {
    
    public static void main(String[] args) {
        // Deklarasi Enumerasi
        enum Hari {
            SENIN, SELASA, RABU, KAMIS, JUMAT, SABTU, MINGGU
        }

        Hari hariIni = Hari.SENIN;

        if (hariIni == Hari.SENIN) {
            System.out.println("Hari ini adalah Senin!");
            System.out.println("Besok adalah " + Hari.SELASA);
        }
    }
}
