package searching.LinearSearch;

import java.util.Arrays;


public class searchInString {

    public static void main(String[] args) {
        String name = "Kunal";
        char target = 'u';

        int dem=345;


        System.out.println(search(name,target));


    }


    static boolean search(String str, char target) {
        if (str.length() == 0) {   // here length() is a function that return the length of string
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

//    static boolean search2(String str, char target) {
//        if (str.length() == 0) {
//            return false;
//        }
//
//        for(char ch : str.toCharArray()) {    //  for for each loop iteration we need an array therefor str.toCharArray() is used to convert string into array of character
//          //      System.out.println(Arrays.toString(name.toCharArray()));

//            if (ch == target) {
//                return true;
//            }
//        }
//        return false;
//    }




}
