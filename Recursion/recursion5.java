package Recursion;
// Print the fibonacci sequence till nth term.
//  0 1 1 2 3 5.........

public class recursion5 {

    public static void printFabonacci(int a, int b, int n) {
        if(n == 0) {
            return;
        }
        System.out.print(a+",");
        printFabonacci(b, a+b, n-1);
    }
    public static void main(String args[]) {
        printFabonacci(0, 1, 5);
    }
}
