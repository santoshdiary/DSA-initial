public class NewLinkedlist {


    Node First;
   private int size=0;

   public class Node{
       String data;
       Node next;
       Node(String data){
           this.data=data;
           this.next=null;
           size++;
       }
   }
    void insertFist(String data){
       Node newNode=new Node(data);
       newNode.next=First;
       First=newNode;
       size++;

    }
    void insertLast(String data){
        Node newNode=new Node(data);

        size++;
        if(First==null){
            newNode.next=First;
            First=newNode;
            return;

        }
        Node currNode=First;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    void deleteFirst(){
       if(First==null){
           System.out.println("Sorry Nothing to delete, List is empty...");
           return;
       }
       First=this.First.next;
       size--;

    }
    void deleteLast(){

        if(First==null){
            System.out.println("Sorry Nothing to delete, List is empty...");
            return;
        }
        size--;


       Node currNode=First;
       Node lastNode=First.next;
       while(lastNode.next!=null){

           currNode=currNode.next;
           lastNode=lastNode.next;
       }
       currNode.next=null;
    }
    void print(){
       Node currNode=First;
       while(currNode!=null){
           System.out.print(currNode.data+" >");
           currNode=currNode.next;
       }
    }


    public static void main(String[] args) {
        NewLinkedlist m=new NewLinkedlist();
        m.insertLast("I ");
        m.insertLast("am ");
        m.insertLast("santosh ");
        m.insertFist("This is");
        m.print();
        m.deleteFirst();
        System.out.println();
        m.print();
        m.deleteLast();
        System.out.println();
        m.print();
        System.out.println();
        System.out.println(" Size of linked list: "+m.size);
    }

}
