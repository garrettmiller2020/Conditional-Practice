package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Say \"yes\"or \"no\"");
        String answer = keyboard.nextLine();

        if(!answer.equalsIgnoreCase("NO")){
           System.out.println("This will print correctly");
        }
    }
}
