package Recursion;

// imp for placement question.
// Q7. Print all the subsequences of a string. -- possible combination whether all together or not
public class recursionAdv7 {
    public static void printSubseq(String str, int idx, String res) {
        if(idx == str.length()) {
            System.out.println(res);
            return;
        }
//choose
        printSubseq(str, idx+1, res+str.charAt(idx));
//don't choose
        printSubseq(str, idx+1, res);
    }
    public static void main(String args[]) {
        String str1 = "abc";
        String str2 = "aaa";
        printSubseq(str2, 0, "");
    }}