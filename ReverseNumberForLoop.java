//Write a Program to reverse the integer number using while loop.

public class ReverseNumberForLoop {
    public static void main(String[] args) {
        int n = 1234, reverse = 0;
        for (; n != 0; n = n / 10) {
            int number = n % 10;
            reverse = reverse * 10 + number;
        }
        System.out.println("The reverse number is=" + reverse);
    }
}
