package Recursion;
// Q7. Print x^n (with stack height = logn)  -- basically it used to decrease the level of stack during the recursion.
// so that we can optimise code and decrease time complexity .

public class recursion7 {

    public static int printPower(int x, int n) {
        if(n == 0) {
            return 1;
        }
        if(n % 2 == 0) {
            return printPower(x, n/2) * printPower(x, n/2);
        }
        else {
            return x * printPower(x, n/2) * printPower(x, n/2);
        }
    }
    public static void main(String args[]) {
        int x = 2, n = 5;
        int output = printPower(x, n);
        System.out.println(output);
    }

}
