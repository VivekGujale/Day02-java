//Write a Program to Check Vowel or Consonant using Switch case.

import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {
        System.out.println("Enter the Alphabet:");
        Scanner Scanner = new Scanner(System.in);
        String alphabet = Scanner.next();
        switch (alphabet) {
            case "a":
                System.out.println("Vowel");
                break;
            case "e":
                System.out.println("Vowel");
                break;
            case "i":
                System.out.println("Vowel");
                break;
            case "o":
                System.out.println("Vowel");
                break;
            case "u":
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}
