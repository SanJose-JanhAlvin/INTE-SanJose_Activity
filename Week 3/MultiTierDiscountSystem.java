/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author janha
 */
public class MultiTierDiscountSystem {
    public static void main(String[] args) {
        double purchaseAmount = 1738.00;
        double discountRate;

        if (purchaseAmount >= 1000.0) {
            discountRate = 0.15;
        } else if (purchaseAmount >= 500.0) {
            discountRate = 0.10;
        } else if (purchaseAmount >= 100.0) {
            discountRate = 0.05;
        } else {
            discountRate = 0.0;
        }

        double discountAmount = purchaseAmount * discountRate;
        double finalPrice = purchaseAmount - discountAmount;

        System.out.println("Purchase Amount: $" + purchaseAmount);
        System.out.println("Discount Tier: " + (int)(discountRate * 100) + "%");
        System.out.println("Final Price: $" + finalPrice);
    }
}
