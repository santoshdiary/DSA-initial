public class doublyLInked_Basic {
public  static class Node{
    int data;
    Node next;
    Node prev; // It is hold the previous Node address.
    Node(int data){
        this.data=data;
    }
}

    public static void main(String[] args) {
        // creation of Node.
    Node a=new Node(8);
    Node b=new Node(7);
    Node c=new Node(79);
    Node d=new Node(67);

        // to link the Nodes.
        a.next=b;
        b.prev=a;

        b.next=c;
        c.prev=b;

        c.next=d;
        d.prev=c;


        // display linkedlist
        System.out.print(a.data+" ");
        System.out.print(b.data+" ");
        System.out.print(c.data+" ");
        System.out.println(d.data+" ");
        // a.next.next.next - represent address of d node
        // a.next.next.next.data - represent data of d node
        System.out.println(a.next.next.next.data);
        // we can traverse backward like this

        System.out.println(d.prev.prev.prev.data);
        // it will print value of "a"


    }



}
