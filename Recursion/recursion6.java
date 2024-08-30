package Recursion;
//Q6. Print x^n (with stack height = n)
public class recursion6 {

    public static int printPower(int x, int n) {
        if(n == 0) {
            return 1;
        }
        if(x == 0) {
            return 0;
        }



        int xPowNM1 = printPower(x, n-1);     // x^n = x * x^n-1 -- logic is
        int xPown = x * xPowNM1;
        return xPown;
    }
    public static void main(String args[]) {
        int x = 2, n = 5;
        int output = printPower(x, n);
        System.out.println(output);
    }
}
