import java.util.LinkedList;

// Linked List implementation with help of java collection frame work 
public class linkedListCollectionFramwork {
    public static void main(String[] args) {
        LinkedList<Integer> li=new LinkedList<>();
        li.add(8);
        li.add(7);
        li.add(8);
        li.add(4);
        li.add(3);
        li.add(2);
        System.out.println("size of linked list "+li.size());
        System.out.println(li);
        li.add(2, 89);
        System.out.println(li);

        li.addFirst(12);
        System.out.println(li);
        li.addLast(90);
        System.out.println(li);
      System.out.println(  li.get(8));
      li.removeFirst();
      System.out.println(li);
     System.out.println( li.peek()); // head of linked list.
    }
}
