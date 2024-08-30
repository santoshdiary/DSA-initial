package Recursion;
 // print 1 to 5
public class recursion2 {

     public static void printNumber(int n){
         if(n==6){       // base case - until the recursion continue
             return ;
         }
         System.out.println(n); // our operation.
         printNumber(n+1); // Recursion - call itself.
     }

     public static void main(String[] args) {
         int n=1;
         printNumber(n);
     }

}
