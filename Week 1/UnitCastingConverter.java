/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author janha
 */
public class UnitCastingConverter {
        public static void main(String[] args) {
        double totalCentimeters = 171.55;

        int wholeMeters = (int) (totalCentimeters / 100);
        double remainingCentimeters = totalCentimeters % 100;

        System.out.println("Total Centimeters: " + totalCentimeters);
        System.out.println("Whole Meters: " + wholeMeters);
        System.out.println("Remaining Centimeters: " + remainingCentimeters);

        int itemQuantity = 50;
        double exactQuantity = itemQuantity;
        System.out.println("Implicit Widening: " + exactQuantity);

        double targetPrice = 99.99;
        int wholePrice = (int) targetPrice;
        System.out.println("Explicit Narrowing: " + wholePrice);
    }
}
