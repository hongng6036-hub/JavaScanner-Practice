package com.TTS;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Hello, what is your name?");
        String firstName = userInput.nextLine();
        System.out.println("What do you do?");
        String Adverb = userInput.nextLine();
        System.out.println("How good are you at it?");
        String Adjective = userInput.nextLine();
        System.out.println("Give me a noun (friend)?");
        String Noun = userInput.nextLine();
        System.out.println("Where are do you want to go");
        String Place = userInput.nextLine();
        System.out.println("In how many days do you want to go?");
        String NumberDays = userInput.nextLine();
        System.out.println("My name is?");
        String yourName = userInput.nextLine();

        System.out.printf("Dear %s!\n", firstName);
        System.out.printf("You %s %s and I want to be your %s!", Adverb, Adjective, Noun);
        System.out.printf("\nI want to go to the %s with you in %s days.", Place, NumberDays);
        System.out.printf("\nSincerely, %s", yourName);
    }
}
