package Queue;
import java.util.*;

//queue using Java Collection Framework



public class usingCollection {
    public static void main(String args[]) {
        //Queue<Integer> q = new LinkedList();
        Queue<Integer> q = new ArrayDeque();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);


        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}








