public class patternQuestion {
    public static void main(String[] args) {

        /* pattern 1

         *****
         *****
         *****
         *****
         *****

         */


    //    for(int i=1;i<=5;i++){
    //        for(int j=1;j<=5;j++){
    //            System.out.print("* ");
    //        }
    //        System.out.println();
    //    }

        /* pattern 2

         *****
         *   *
         *   *
         *   *
         *****

         */
        int r=4;
        int c=5;

        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
            if(i==1||j==1||i==r||j==c){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
            }
            System.out.println();
        }


    }
}