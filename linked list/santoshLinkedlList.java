

public class santoshLinkedlList {
Node Head;
private int size;

public class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

    void insertFirst(int data){
        Node newNode=new Node(data);
        newNode.next=Head;
        Head=newNode;

    }
    void insertLast(int data){
    Node newNode=new Node(data);
    if(Head==null){
        newNode.next=Head;
        Head=newNode;
        return;
    }
    Node lastNode=Head;  // here lastNode is temp node which now  only point out head;
    while(lastNode.next!=null){       // transversing until lastNode point out last node
       lastNode=lastNode.next;  // updating lastNode so that we  move on  next node
    }
        lastNode.next = newNode;  // final assignment;

    }
    void print(){
    Node lastNode=Head;
    while(lastNode!=null){
        System.out.print(lastNode.data+" ->  ");
        lastNode=lastNode.next;  // updating lastNode to move on next node
    }

    }
    void deleteFirst(){
    if(Head==null){
        System.out.println(" list is empty Nothing to delete");
    }
    Head=this.Head.next; // we make new Head nextNode , hence automatically our new Head shift on next node
    size--;
    }

    void deleteLast(){
        if(Head==null){
            System.out.println(" list is empty Nothing to delete");
            return;
        }
          size--;
        if(Head.next==null){
            Head=null;
            return;
        }
        Node currNode=Head;
        Node lastNode=Head.next;
        while(lastNode.next!=null){  //666 ->  65 ->  4 ->  8 ->
           currNode=currNode.next;   //            currNode  lastNode
           lastNode=lastNode.next;
        }
        currNode.next=null;
    }

    public static void main(String[] args) {
    santoshLinkedlList ll=new santoshLinkedlList();
        ll.insertFirst(4);
        ll.insertFirst(65);
        ll.insertFirst(666);
        ll.insertLast(8);
        System.out.println(ll.Head.data+" ");
        System.out.println(ll.Head.next.data+" ");
        System.out.println(ll.Head.next.next.data+" ");
        System.out.println(ll.Head.next.next.next.data+" ");

        ll.print();
        ll.deleteFirst();
        System.out.println();
        ll.print();
        ll.deleteLast();
        System.out.println();
        ll.print();

    }
}
