package Hashing;


import java.util.*;

// what is hashing ?

/*  Hashing is a process  that used for search element in a constant time in a list or array here elemet keep in a pair that contain key-value . Here "key" is integer value  type and "vaue" is Sting type . Array, in which it is implemented that array indexes is called buketes and which array indexe contain more than one elemet at same index that element is called key-pair chaining 
 
link - https://youtu.be/NGd08g328i4?si=klJDCrOPgJo_V8L4
*/



// USING JAVA COLLECTION FRAMEWORK 

public class Hashing {
   public static void main(String args[]) {
       //Creation
       HashMap<String, Integer> map = new HashMap<>();


       //Insertion
       map.put("India", 120);
       map.put("US", 30);
       map.put("China", 150); // key is unique that can't repeat, value may be repeated


       System.out.println(map);


       map.put("China", 180);
       System.out.println(map);




       //Searching
       if(map.containsKey("Indonesia")) {
           System.out.println("key is present in the map");
       } else {
           System.out.println("key is not present in the map");
       }


       System.out.println(map.get("China")); //key exists
       System.out.println(map.get("Indonesia")); //key doesn't exist


       //Iteration (1)

       // for(int val:arr) like that for each loop
       for( Map.Entry<String, Integer> e : map.entrySet()) {  // e - val
           System.out.println(e.getKey());
           System.out.println(e.getValue());
       }


       //Iteration (2)
//       Set<String> keys = map.keySet();

       
//       for(String key : keys) {
//           System.out.println(key+ " " + map.get(key));
//       }


       //Removing
       map.remove("China");
       System.out.println(map);


   }
}
