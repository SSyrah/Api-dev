/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.linux;

/**
 *
 * @author juhis
 */
public class MyMath {
    public static int randomInteger(int min, int max){
        //lasketaan vaihtoehdot
        int options = max - min + 1;
        int randomInt = (int) (Math.random() * options) + min;
        
        return randomInt;
    }
}
