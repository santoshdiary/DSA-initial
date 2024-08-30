package Recursion;

// printing in reverse order
public class recursionAdv2 {
   public static void printRev(String str, int idx){
       if(idx==0){
           System.out.print(str.charAt(idx));
           return;

       }
       System.out.print(str.charAt(idx));

       printRev(str,idx-1);
   }


    public static void main(String args[]) {
    String str="Santosh";
    printRev(str,6);
    }
}