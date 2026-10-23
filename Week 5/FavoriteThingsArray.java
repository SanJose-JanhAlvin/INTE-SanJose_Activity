/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author janha
 */
public class FavoriteThingsArray {
    public static void main(String[] args) {
        String[] favorites = {"Gaming", "Movies", "Music", "Eating", "Travelling"};
        
        System.out.println("--- My Favorite Things to do ---");
        
        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }
        
        System.out.println("\nTotal items in the list: " + favorites.length);
    }
}
