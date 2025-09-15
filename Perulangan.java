package com.kelompok2.praktikumpbo4;

import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        
        // For loop
        int i;
        for (i = 1; i <= 5; i++) {
            System.out.println("Perulangan ke-" + i);
        }
        
        String[] mahasiswa = {"Sehun", "Suho", "Aura", "Chanyeol", "Kai"};
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
            System.err.println("Masukkan password: ");
            password = input.nextLine();
        }
        
        System.out.println("Login Berhasil!");
        
        // Do while
        int x = 6;
        
        do {
            System.out.println("Do While loop ke-" + x);
            x++;
        } while (x <= 5);
        
        // Nested loop
        System.out.println("---Mencetak nomor kursi bioskop---");
        char kursi = 'A';
        for (int s = 0; s < 3; s++) {
            for (int t = 1; t <= 5; t++) {
                System.err.println(kursi + "" + t + "");
            }
            System.out.println();
            kursi++;
        }
    }
}
