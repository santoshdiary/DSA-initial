
class linked_list {


    Node head;  //Node is "type" that point out first node.
    private int size;
 
 
   linked_list() {
        size = 0;
    }
 
 
    public class Node { // node contain two things one is data and second is address of next node.
        String data;
        Node next; // "Next" is variable that hold the address of Next Node therefore  type is node.
 
 
        Node(String data) {
            this.data = data;
            this.next = null; // every "new node" point out  next "null node" by default.
            size++;
        }
    }
 
 
    public void addFirst(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
 
 
    public void addLast(String data) {
        Node newNode = new Node(data);
 
 
        if(head == null) {
            head = newNode;
            return;
        }
 
 
        Node lastNode = head;
        while(lastNode.next != null) {
            lastNode = lastNode.next; // updating lastNode so that we move on next node until given condition
        }
 
 
        lastNode.next = newNode; // finally assign newNode in list
    }
 
 
    public void printList() {
        Node currNode = head;
 
 
        while(currNode != null) {    // until current node ==null so that we print all list.
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
 
 
        System.out.println("null");
    }
 
 
    public void removeFirst() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
 
 
        head = this.head.next;
        size--;
    }
 
 
    public void removeLast() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
 
 
        size--;
        if(head.next == null) {
            head = null;
            return;
        }
 
 
        Node currNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
 
 
        currNode.next = null;
    }
 
 
    public int getSize() {
        return size;
    }
  
 
 
 
 
    public static void main(String args[]) {
        linked_list list = new linked_list();
        list.addLast("is");
        list.addLast("a");
        list.addLast("list");
        list.addLast("santoshs'");
        list.printList();
 
 
        list.addFirst("this");
        list.printList();

        System.out.println(list.getSize()); 
 
 
        list.removeFirst();
        list.printList();
 
 
        list.removeLast();
        list.printList();
    }
 }
 

 
 