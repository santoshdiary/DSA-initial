  public class linkedListBasic {
    public static class Node{
        int data;// value

        Node next; // address of next node
        Node(int data){
            this.data=data;
        }
    }

      public static void main(String[] args) {

        // creation of Node.
          Node a=new Node(5);
          Node b=new Node(4);
          Node c=new Node(6);
          Node d=new Node(2);
          Node f=new Node(4);
          // to link the Nodes.
          a.next=b; // a->b
          b.next=c; // a->b->c
          c.next=d; //a->b->c->d
          d.next=f; // a->b->c->d ->f

          // display linkedlist
          System.out.print(a.data+" ");
          System.out.print(b.data+" ");
          System.out.print(c.data+" ");
          System.out.print(d.data+" ");
          System.out.println(f.data+" ");

          // a.next.next.next - represent address of d node
          // a.next.next.next.data - represent data of d node
          System.out.println(a.next.next.next.data);


      }
}
