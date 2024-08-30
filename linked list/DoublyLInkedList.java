public class DoublyLInkedList {

    Node Head;
    private int size;
    DoublyLInkedList(){
        size=0;
    }
    public class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
            size++;
        }
    }

    void AddFirst(int data){
        Node a=new Node(data);
        a.next=Head;
        Head.prev=a;
        Head=a;
        size++;
    }
    void AddLast(int data){
        Node a=new Node(data);
        if(Head==null){
            Head=a;
            size++;
            return;
        }
        Node lastNode=Head;
        while(lastNode.next!=null){
           lastNode=lastNode.next;
        }

        lastNode.next=a;
        a.prev=lastNode;
        size++;
    }

    void printlist(){
        Node tem=Head;
        Node last=null;

        while(tem!=null){
            System.out.print(tem.data+" -> ");
            last=tem; // it will update "last" node
            tem=tem.next;
        }

        System.out.println("End");
        System.out.println("printing in reverse order");


        // now we are at last node  & moving backward
        while(last!=null){
            System.out.print(last.data+" -> ");
            last=last.prev;
        }
        System.out.print("Start");
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLInkedList li =new DoublyLInkedList();
        li.AddLast(8);
        li.AddLast(7);
        li.AddLast(3);
        li.AddLast(9);
        li.AddLast(2);

        li.printlist();

    }

}
