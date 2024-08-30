import java.util.Stack;
import java.util.Scanner;


// stack implementation with java collection frame work .


public class stacBasic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        // implementation of stack 
        Stack<Integer> st=new Stack<>();

        // push operation- 
        st.push(81);
        st.push(86);
        st.push(75);
        st.push(47);
        st.push(24);
        st.push(55);


        // printing the stack
        System.out.println(st);
        // pop operation

        st.pop();
        System.out.println(st);

        st.pop();
        System.out.println(st);
        
        // .size() operation for find out the size of stack
       System.out.println("the size of stack is :"+ st.size());

       // .isEmpty() operation for find out the stack is empty or not
       System.out.println(st.isEmpty());

       // taking input from user
        System.out.println("Enter the Number of Elemnet that you want to insert:");
        int n=sc.nextInt();

        // another stack
        Stack<Integer> user =new Stack<>();
        System.out.println("Enter the Element:");
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            user.push(x);
        }

        System.out.println(user);
    }
    
}
