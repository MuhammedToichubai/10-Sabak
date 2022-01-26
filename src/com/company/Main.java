package com.company;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    }

    static void concatKoshuu() {
        String name = " Hello world! ";
        String newName2 = name.replace("world", "Muhammed");

    }
        static void muha(){
        String name = " Hello world! ";
        for (int i = 0; i < name.length(); i++) {
            if (i == name.length()-1) {
                System.out.println(name.charAt(i));
            } else {
                System.out.print(name.charAt(i) + ",");
            }

        }

    }
    static void replaceBirSozunOzgortuu() {
        String name = " Hello world! ";
        String newName2 = name.replace("world","Muhammed");

        System.out.println(newName2);
        System.out.println(newName2.length()); // kancha tamga bar ekenin eseptep beret.


    }
    static void equalsSalyshtyruu() {
        String name = " Hello world! ";
        String newName2 = name.trim();

        System.out.println(name.equals(newName2));

       // System.out.println("Hello".equals("hello");
       // System.out.println("Hello".equalsIgnoreCase("hello");
        // equalsIgnoreCase - tamganyn chon kichinesine karabai kabyl alat
    }

    static void trim() {
        String name = " Hello world! ";
        String newName = name.trim();

        System.out.println(name);
    }
    static void toLowerCase(){
        String name = "Hello world";
        System.out.println(name.toLowerCase());

    }

    static void toUpperCase(){
        String name = "Hello world";
        System.out.println(name.toUpperCase());

    }
    static void  ContainsStringTeksheruu(){
        String name = "Hello world";
        System.out.println(name.contains(" world"));
    }
    static void tapshyrma(){
        Scanner scanner = new Scanner(System.in);
        String st = scanner.nextLine();
    }

    static void charString(){
        String word = "Hello";
        char symbol = word.charAt(3);
        System.out.println(symbol);
    }
    static  void  charAtString2(){
        char symbol = "hello".charAt(3);
        System.out.println(symbol);

    }
    static  void  subString(){
        String  st = "Hello world!";
        String newWord = st.substring(6,11);
        System.out.println(newWord);


    }

    static void personMethod(){
        String[] people ={" Muhammed"," Aizhan"," Munara"," Neska"," Peaksoft"};
        for( String names:people){
            System.out.println("I love you"+ names);
        }
    }



    static int methodSumma(int ... it){
        int summa = 0;
        for (int i = it[0]; i < it.length; i++) {
           summa += it[i];

        }
     return summa;

    }

}
