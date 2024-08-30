package Recursion;

public class recursion1 {
// q1. print 5 to 1
    public static void printNumber(int n){
        if(n==0){       // base case - until the recursion continue
            return ;
        }
        System.out.println(n); // our operation.
        printNumber(n-1); // Recursion - call itself.
    }
    public static void main(String[] args) {

        int n=5;
        printNumber(n);

    }
}
