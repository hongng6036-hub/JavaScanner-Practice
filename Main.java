package com.TTS;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System.out.printf("Hello World!\n");
        //System.out.printf("Today is awesome!\n");
        System.out.println("What is your first name?");
        String firstName = input.nextLine();
        System.out.println("What is your last name?");
        String lastName = input.nextLine();
        System.out.printf("Hello %s %s!\n", firstName, lastName);
        System.out.printf("Goodbye %s %s!\n", firstName, lastName);
    }
}