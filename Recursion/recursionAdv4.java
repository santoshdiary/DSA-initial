package Recursion;

//Q4. Check if an array is sorted (strictly increasing). - O(n)


public class recursionAdv4 {
    public static boolean isSorted(int arr[],int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            // array is sorted till now
            return isSorted(arr,idx+1);
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        int []arr={5,33,83,552};
        System.out.println(isSorted(arr,0));
    }
}