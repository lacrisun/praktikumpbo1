package com.kelompok2.praktikumpbo4;

import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {
        
    // If-else
    Scanner input = new Scanner(System.in);
    System.out.print("Masukkan nilai : ");
    int nilai = input.nextInt();

    if (nilai > 75) {
        System.out.println("Anda lulus ujian!");
    } else {
        System.out.println("Anda harus mengulang ujian!");
    }

    // If-Else if-ELSE
    System.out.print("Masukkan nilai : ");
    int nilaiKedua = input.nextInt() ;
    input.nextLine(); //Mengonsumsi nilai sisa

    if (nilaiKedua > 75) {
        System.out.println("Anda lulus ujian!");
    } else if (nilaiKedua > 65) {
        System.out.println("Nilai anda berada di ambang batas kelulusan");
    } else {
        System.out.println("Anda harus mengulang ujian");
    }

    // Switch case
    System.out.print("Masukkan warna (RGB) : ");
    String warna = input.nextLine();

    switch (warna) {
        case "R":
            System.out.println("Anda memilih warna merah");
            break;
        case "G":
            System.out.println("Anda memilih warna hijau");
            break;
        case "B":
            System.out.println("Anda memilih warna Biru");
            break;
        default:
            System.out.println("Warna tidak tersedia");
    }

    // Nested if
    System.out.print("Masukkan angka : ");
    int angka = input.nextInt();
    if (angka >= 0) {
        System.out.println("Bilangan bernilai positif");
        if (angka % 2 == 0) {
            System.out.println("dan genap");
        } else {
            System.out.println("dan ganjil");
        }
    } else if (angka == 0) {
        System.out.println("Bilangan bernilai netral");
    } else {
        System.out.println("Bilangan bernilai negatif");
        if (angka % 2 == 0) {
            System.out.println("dan genap");
        } else {
            System.out.println("dan ganjil");
        }
    }

    input.close();
    }
}