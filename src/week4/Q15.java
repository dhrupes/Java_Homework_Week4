package week4;

public class Q15 {
    /*
   15. Display left angle triangle of * using nested for loops
*
* *
* * *
* * * *
* * * * *
*/

    public static void main(String[] args) {

            for (int i=0;i<=4;i++){

                for(char j= 0;j<=i;j++)
                {

                    System.out.print("*");
                    System.out.print(" ");

                }
                System.out.println();
            }
    }
}
