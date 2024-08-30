package Recursion;


 //Q6. Remove duplicates in a string.


  public class recursoinAdv6 {
  public static boolean [] map=new boolean[26]; // arr for 26 alphabet
    //  Note:- By default value of boolean variable is false
      public static void removeDuplicates(String str, int idx, String newString){
          if(idx==str.length()){
              System.out.println(newString);
              return ;

          }
          char currChar=str.charAt(idx);
          if(map[currChar-'a']==true){  // Note  character-character=integer value; map[integer] i.e. array index accessing
              // ture statement means array map[index] is already lie in alphabet
              removeDuplicates(str,idx+1,newString); // recursive calling

          }else{
              // else means, array map[index] is not repeat till now so, store it in new string.
              newString+=currChar;
              map[currChar-'a']=true;  // updation of alphabet state.
              removeDuplicates(str,idx+1,newString);
          }
      }


      public static void main(String[] args) {
          String str="aacchhiee";
          removeDuplicates(str,0,"");
      }
}