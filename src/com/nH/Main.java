package com.nH;
import java.util.Locale;
import  java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Favorite color: ");
        String color = scan.nextLine();

        System.out.println("Enter your first programming language:  ");
        String programming = scan.nextLine();


        System.out.println("Enter your Favorite food:  ");
        String food = scan.nextLine();


        System.out.println(color + " is great color");
        System.out.println( programming + " wow i love this langauge!");
        System.out.println(food +  " is good food");





    }
}
