package week4;

public class Q14 {
   /* 14. Write a program in Java to display the pattern like a diamond.
    While loop
            *
           ***
          *****
         *******
        *********
       ***********
      *************
       ***********
        *********
         *******
         *****
          ***
           *
    */
   public static void main(String[] args) {

       for(int i=1;i<7;i++){
           for(int j=1;j<=7-i;j++)
           System.out.print(" ");
           for(int j=1;j<=2*i-1;j++)
               System.out.print("*");
           System.out.print("\n");

       }
       for(int i=6-1;i>=1;i--)
       {
           for(int j=1;j<=7-i;j++)
               System.out.print(" ");
           for(int j=1;j<=2*i-1;j++)
               System.out.print("*");
           System.out.print("\n");
       }
   }
}

