package com.example.linux;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){    
        
        Dog doggy = new Dog("Tyrell");
        System.out.println("Dog name is " + doggy.getName());
        
        Dog doggy2 = new Dog("Rex");
        
        doggy.play();
        doggy.play(doggy2);
        
        //näkyvyysmääreet: public/ ei mitään / protected / private
        
        ArrayList<String> words = new ArrayList<>();
        words.add("Testi");
        words.add("Toinen testi");
        words.add("Terve");
        
        for (String list : words){
            System.out.println(list);
        }
     
    // Tehtävät:
    //1. Metodi printtaa Hello World!
    //2. Metodille annetaan merkkijono, ja tulostetaan merkkijonon kirjaimet allekkain.
    //3. Metodille annetaan int-tyyppinen taulukko, ja palautetaan lukujen keskiarvo.
    //4. Metodille annetaan min ja max, ja palautetaan kokonaisluku näiden väliltä. Tee metodi omaan luokkaan MyMath.
    //5. Metodille annetaan String-tyyppinen lista ja palautetaan listan pisin merkkijono.    
        
    //1    
    HelloWorld();
    
    //2
    printChars("Juhis");
    
    //3
    int[] numbers = {2,3,4};
    double average = getAverage(numbers);
    System.out.println(average);
    
    //4
    System.out.println(MyMath.randomInteger(1,6));
    
    //5
    ArrayList<String> word = new ArrayList<>();
    word.add("Testi");
    word.add("Koo");
    word.add("etstsastsa");
    
    String longest = longestWord(word);
        System.out.println("Longest word is" + longest);
    
    }
    public static void HelloWorld(){
        System.out.println("Hello World!");
    } 
    
    public static void printChars(String text){
        for (int i=0; i <text.length(); i++){
            System.out.println(text.charAt(i));
        }
    }
    public static double getAverage(int[] array){
        double sum = 0;
        
        for (int x : array){
            sum+=x;
        }
        
        double average = sum / array.length;
        return average;
    }
    
    public static String longestWord(ArrayList<String> words){
        String longest = words.get(0);
        
        for (String word : words){
            if (word.length() > longest.length()){
                longest = word;
            }
        }
        return longest;
    }
    
    
}
