//write a program SpringSeason.java that takes two int values m and d from the command line and
// prints true if day d of month m is between March 20 (m = 3, d=20) and June 20 (m = 6, d = 20),
// false otherwise.

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);
        System.out.println("Enter the Day and month");
        int day = object.nextInt();
        int month = object.nextInt();
        if ((month == 3 && day >= 20 && day <= 31))
            System.out.println("True");
        else if ((month == 4 && day >= 1 && day <= 30))
            System.out.println("True");
        else if ((month == 5 && day >= 1 && day <= 31))
            System.out.println("True");
        else if ((month == 6 && day >= 1 && day <= 20))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
