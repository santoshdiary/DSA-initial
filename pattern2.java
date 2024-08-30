public class pattern2 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){

                System.out.print("* ");
            }
            System.out.println();

        }
        /*   pattern will be printed

        *
        **
        ***
        ****


        no.of column depend on no. of rows for example if row no. is 1 then column is also
        run one time , if column is 2 then column is also run two time.

        */

        System.out.println("inverse of give pattern will be printed like this:\n");
        for(int i=n;i>=1;i--){

            for(int j=1;j<=i;j++){

                System.out.print("* ");
            }
            System.out.println();
            

        }


    }
}
