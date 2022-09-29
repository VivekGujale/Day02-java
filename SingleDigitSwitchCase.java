//Read a single Digit Number and write in word using switch case.

import java.util.Scanner;

public class SingleDigitSwitchCase {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner obj = new Scanner(System.in);
        int input = obj.nextInt();
        switch (input) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            case 6:
                System.out.println("Six");
                break;
            case 7:
                System.out.println("Seven");
                break;
            case 8:
                System.out.println("Eight");
                break;
            case 9:
                System.out.println("NIne");
                break;
            default:
                System.out.println("Number is out of range");
        }
    }
}
