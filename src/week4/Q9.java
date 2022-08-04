package week4;

public class Q9 {

    /*
    9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
     */

    public static void main(String[] args)
    {
        int number = 10, previousno = 1, nextno = 1;
        System.out.print("Fibonacci Series of "+number+" numbers:");

        int i=1;
        while(i <= number)
        {
            System.out.print(previousno+" ");
            int sum = previousno + nextno;
            previousno = nextno;
            nextno = sum;
            i++;
        }

    }

}
