//Write a Program to reverse the integer numbers using while loop.

public class ReverseNumberWhile {
    public static void main(String[] args) {
        int n = 1234, reverse = 0;
        while (n != 0) {
            int number = n % 10;
            reverse = reverse * 10 + number;
            n = n / 10;
        }
        System.out.println("The reverse number is=" + reverse);
    }
}
