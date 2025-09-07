package com.kelompok2.praktikumpbo3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kitsunne
 */

    import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        // Print per baris
        System.out.println("Hello World");
        System.out.println("Baris Kedua");
        
        // Print dalam satu baris
        System.out.print("Hello ");
        System.out.print("World!");
        System.out.println();
        
        // Formatted output
        String nama = "Ana";
        int umur = 18;
        double tinggi = 159.5;
        
        System.out.printf("Nama: %s, Umur: %d, Tinggi: %.1f cm%n", nama, umur, tinggi);
        
        // Input dengan scanner
        Scanner scanner = new Scanner(System.in);
        
        // Input string
        System.out.print("Masukkan nama: ");
        String name = scanner.nextLine();
        
        // Input integer
        System.out.print("Masukkan umur: ");
        int umurAnda = scanner.nextInt();
        
        // Input double
        System.out.print("Masukkan tinggi badan: ");
        double tinggiBadan = scanner.nextDouble();
    }
}

