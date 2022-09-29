//Write a Program to find Palindrome Number using for loop.

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int a, sum, remainder;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = obj.nextInt();
        a = num;
        for (sum = 0; num > 0; num /= 10) {
            remainder = num % 10;
            sum = sum * 10 + remainder;
        }
        if (sum == a) {
            System.out.println("Given number is palindrome");
        } else {
            System.out.println("Given number is not palindrome");
        }

    }
}

