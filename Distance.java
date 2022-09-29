//Write a program Distance.java that takes two integer command-line arguments x and y and
// prints the Euclidean distance from the point (x, y) to the origin (0, 0).
// The formulae to calculate distance = sqrt(x*x + y*y). Use Math.power function.

public class Distance {
    public static void main(String[] args) {
        int x = 5;
        int y = 12;
        double distance = Math.sqrt(x*x + y*y);
        System.out.println("distance from ("+x+","+y+") to (0, 0) = " + distance);
    }
}
