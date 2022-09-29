////Write a Program for the sum of n natural numbers using while loop.

public class SumWhileLoop {
    public static void main(String[] args) {
        int n = 20, sum = 0, i = 1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println("Total Sum =" + sum);
    }
}
