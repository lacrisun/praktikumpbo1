/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kelompok2.praktikumpbo3;

/**
 *
 * @author kitsunne
 */
public class ClassWrapper {
    public static void main(String[] args) {
        // Autoboxing - primitif ke wrapper
        int primitifInt = 100;
        Integer wrapperInt = primitifInt; // Autoboxing

        // Unboxing - wrapper ke primitif
        Integer anotherWrapper = 200;
        int anotherPrimitif = anotherWrapper; // Unboxing

        // Konversi String ke primitif
        String strNumber = "67";
        String strDouble = "41.67";
        String strBoolean = "true";

        int num = Integer.parseInt(strNumber);
        double decNum = Double.parseDouble(strDouble);
        boolean boolVal = Boolean.parseBoolean(strBoolean);

        System.out.println("Parsed int : " + num);
        System.out.println("Parsed double : " + decNum);
        System.out.println("Parsed boolean : " + boolVal);

        // Konversi primitif ke wrapper
        int valueInt = 100;
        double valueDouble = 41.67;
        boolean valueBoolean = true;

        Integer objInt = Integer.valueOf(valueInt);
        Double objDouble = Double.valueOf(valueDouble);
        Boolean objBoolean = Boolean.valueOf(valueBoolean);

        System.out.println("Wrapper Integer : " + objInt);
        System.out.println("Wrapper Double : " + objDouble);
        System.out.println("Wrapper Boolean : " + objBoolean);

        // Konversi ke String
        int strValueInt = 100;
        double strValueDouble = 41.67;
        boolean strValueBoolean = true;

        String strValInt = Integer.toString(strValueInt);
        String strValDouble = Double.toString(strValueDouble);
        String strValBoolean = Boolean.toString(strValueBoolean);

        System.out.println("toString() : " + strValInt);
        System.out.println("toString() : " + strValDouble);
        System.out.println("toString() : " + strValBoolean);

        // Konstanta
        System.out.println("Max Integer : " + Integer.MAX_VALUE);
        System.out.println("Min Integer : " + Integer.MIN_VALUE);

        // Konversi ke biner, oktal, dan heksadesimal
        int angkaDesimal = 255;
        System.out.println("Binary : " + Integer.toBinaryString(angkaDesimal));
        System.out.println("Octal : " + Integer.toOctalString(angkaDesimal));
        System.out.println("Hexadecimal : " + Integer.toHexString(angkaDesimal));
    }
}

