/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.praktikum3oop;

/**
 *
 * @author user
 */
public class ClassWrapper {
    
    public static void main(String[] args) {

        // Autoboxing - primitf ke wrapper
        int primitifInt = 100;
        Integer wrapperInt = primitifInt; // Autoboxing

        // Unboxing - wrapper ke primitif
        Integer anotherWrapper = 200;
        int anotherPrimitif = anotherWrapper; // Unboxing

        // Konversi String ke primitif
        String strNumber = "67";
        String strDouble = "41.67";
        String strBoolean = "true";

        // Parse methods
        int num = Integer.parseInt(strNumber);
        double decimal = Double.parseDouble(strDouble);
        boolean flag = Boolean.parseBoolean(strBoolean);

        System.out.println("Parsed int : " + num);
        System.out.println("Parser double : " + decimal);
        System.out.println("Parsed boolean : " + flag);

        // Konversi String ke wrapper
        Integer wrapperNum = Integer.valueOf(strNumber);
        Double wrapperDecimal = Double.valueOf(strDouble);

        System.out.println("Wrapper Integer : " + wrapperNum);
        System.out.println("Wrapper Double : " + wrapperDecimal);

        // Wrapper/primitif ke String
        int value = 789;
        String strValue1 = Integer.toString(value);
        String strValue2 = String.valueOf(value);

        System.out.println("toString() : " + strValue1);
        System.out.println("valueOf() : " + strValue2);

        // Integer methods
        System.out.println("Max Integer : " + Integer.MAX_VALUE);
        System.out.println("Min Integer : " + Integer.MIN_VALUE);

        // Konversi sistem bilangan
        int angkaDecimal = 255;
        System.out.println("Binary : " + Integer.toBinaryString(angkaDecimal));
        System.out.println("Octal : " + Integer.toOctalString(angkaDecimal));
        System.out.println("Hexadecimal : " + Integer.toHexString(angkaDecimal));
    }
}
