package Recursion;
// factorial of given number

//  n!=  n * (n-1)!   this statement helps us ,to find out factorial of given number



public class recursion4 {
    public static void printFactorial(int n, int fact) {
        if(n == 0) {
            System.out.println(fact);
            return;
        }
        fact *= n;          // fact=fact*n;
        printFactorial(n-1, fact);
    }
    public static void main(String args[]) {
        printFactorial(5, 1);
    }

}
