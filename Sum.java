//Write a Program for the sum of n natural numbers using for loop.

public class Sum {
    public static void main(String[] args) {
        int n = 20, sum = 0;
        for (int i = 1; i <= n; i++)
            sum = sum + i;
        System.out.println("Total sum is =" + sum);
    }
}

