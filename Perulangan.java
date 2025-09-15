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
public class Perulangan {
    public static void main(String[] args) {
        
        // For loop
        int i;
        for (i = 1; i<= 5; i++) {
            System.out.println("Perulangan ke-" + i);
        }
        
        String[] mahasiswa = {"Andi", "Budi", "Citra", "Dewi", "Eko"};
        for (int j = 0; j < mahasiswa.length; j++) {
            System.out.println("Mahasiswa ke-" + (j + 1) + ": " + mahasiswa[j]);
        }
        
        // While loop
        int a = 1;
        while (a <= 5) {
            System.out.println("While loop ke-" + a);
            a++;
        }
        
        Scanner input = new Scanner(System.in);
        String password = "";
        
        while (!password.equals("java123")) {
            System.err.println("Masukkan password : ");
            password = input.nextLine();
        }
        
        System.out.println("Login Berhasil");
        
        // Do while
        int x = 6;
        
        do {
            System.out.println("Do While Loop ke-" + x);
            x++;
        } while (x <= 5);
        
        // Nested loop
        System.out.println("---Mencetak nomor kursi bioskop---");
        char kursi = 'A';
        for (int s = 0; s<3; s++) {
            for (int t = 1; t<=5; t++) {
                System.err.println(kursi + "" + t + "");
            }
            System.out.println();
            kursi++;
        }
        
    }
    
}
