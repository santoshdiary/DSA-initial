package stack;

// Queue implementation by the help of Array
//queue basic
public class QueueB{
    public static class queue{
        static int [] arr;
        static  int size;
        static int rear;
        queue(int size){
            this.size=size;
            arr=new int[size];
            rear=-1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }
        public static boolean isFull(){
            return rear==size-1;
        }

        public static void add(int data){
            if(isFull()){
                System.out.println(" queue is full --over flow");
                return;
            }
            arr[++rear]=data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty -- under flow");
                return -1;
            }
            int front = arr[0];
            for(int i=0; i<rear; i++) {
                arr[i] = arr[i+1];
            }
            rear--;
           return front;
        }
        public static int peek() {
            if(isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }

            return arr[0];
        }


    }


    public static void main(String args[]) {
       queue q=new queue(5);

        System.out.println(q.isEmpty());

        q.add(28);
        q.add(58);
        q.add(86);
        q.add(88);
        q.add(82);

        System.out.println(q.remove());
        System.out.println(q.isEmpty());
        System.out.println(q.peek());
        // queue.add(8);
        // System.out.println(queue.arr[0]);


    }

}
