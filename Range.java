//Read a Number 1,10,100,1000 and display unit, ten hundred using if-else statement.

import java.util.Scanner;

public class Range {
    public static void main(String[] args) {
        System.out.println("Enter the number like 1,10,100,1000,....");
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        if (n == 1)
            System.out.println("Unit");
        else if (n == 10)
            System.out.println("Ten");
        else if (n == 100)
            System.out.println("Hundred");
        else if (n == 1000)
            System.out.println("Thousand");
        else if (n == 10000)
            System.out.println("Ten Thousand");
        else if (n == 100000)
            System.out.println("Lakh");
        else
            System.out.println("Please enter the range from specified range");
    }
}
