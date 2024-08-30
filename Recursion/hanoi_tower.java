package Recursion;

public class hanoi_tower {
    public static void towerProblem(int n, String src,String helper,String dest){
        if(n==1){
            System.out.println(" Moving disk "+ n +" from "+ src +" to "+ dest);
            return;
        }
        towerProblem(n-1,src,dest,helper);
        System.out.println(" Moving disk "+ n +" from "+ src +" to "+ helper);
        towerProblem(n-1,helper,src, dest);
    }

    public static void main(String[] args) {
        towerProblem(5,"source","helper","destination");
    }
}
