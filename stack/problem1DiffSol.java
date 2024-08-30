package stack;

import java.util.Stack;

public class problem1DiffSol {

    

    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        st.push(44);
        st.push(43);
        st.push(54);
        st.push(84);
        st.push(14);
        System.out.println(st);


        // inserting 12 at bottom of the stack 
        int x=12;
        Stack<Integer> temp =new Stack<>();
        while(st.size()>0){
            temp.push(st.pop());
        }
        st.push(x);
        while(temp.size()>0){
            st.push(temp.pop()) ;

        }
        System.out.println(st);
        st.pop();
        System.out.println(st);
    }
}
