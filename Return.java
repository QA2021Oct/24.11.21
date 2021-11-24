package com.company;

import java.util.Scanner;

public class Return {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        // alcohol...
       float age = getAgeFromUser();

        if (age > 18){
            System.out.println("grown up - take alcohol");
        }
        else {
            System.out.println("come next year(:");
        }
        //String word = sayHello();
        System.out.println(sayHello());
        int arrayInMain[] = getArray();

        for (int i = 0; i < arrayInMain.length; i++){
            System.out.println(arrayInMain[i]);
        }
    }
    public static float getAgeFromUser(){
        System.out.println("Enter your Age: ");
        float age = s.nextFloat();
        return age;
    }

    public static String sayHello(){
        return "Hello";
    }

    public static int [] getArray(){
        int array[] = {7, 9, 8};
        return array;
    }
}