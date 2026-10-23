/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author janha
 */
public class CompoundGrowthncrementTracker {
    public static void main(String[] args) {
        double balance = 5000.0;
        System.out.println("Initial Balance: $" + balance);

        balance += 250.0;
        System.out.println("Balance after deposit: $" + balance);

        balance *= 1.10;
        System.out.println("Balance after 10% interest: $" + balance);

        balance += 500.0;
        System.out.println("Balance after bonus: $" + balance);

        int count = 5;

        System.out.println("Postfix count++: " + count++);
        System.out.println("Value of count right after: " + count);

        System.out.println("Prefix ++count: " + ++count);
        System.out.println("Value of count right after: " + count);
    }
}
