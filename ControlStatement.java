package com.kelompok2.praktikumpbo4;

public class ControlStatement {
    public static void main(String[] args) {

        // Break
        for (int d = 1; d <= 10; d++) {
            if (d == 5) {
                System.out.println("Break di angka " + d);
                break;
            }
            System.out.println("Angka: " + d);
        }

        // Continue
        for (int e = 1; e <= 10; e++) {
            if (e % 2 == 0) {
                continue;
            }
            System.out.println("Bilangan ganjil: " + e);
        }
    }
}    
