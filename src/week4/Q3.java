package week4;

import java.util.Locale;
import java.util.Scanner;

public class Q3 {
    /* 3. Write a Java program that takes the user to provide a single character from the
alphabet. Print Vowel of Consonant, depending on the user input. If the user input
Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
error message.
For eg:
Input an alphabet: p
Expected Output:
Input letter is Consonant */
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.println("Input an alphabet: ");

        String alp = d.next().toLowerCase();

        if ((alp.length() > 1) || (!Character.isAlphabetic(alp.charAt(0)))) {
            System.out.println("Only single letter is allowed");
        } else {
            if ((alp.charAt(0) == 'a') || (alp.charAt(0) == 'e') || (alp.charAt(0) == 'i')
                    || (alp.charAt(0) == 'o') || (alp.charAt(0) == 'u')) {
                System.out.println("Input letter is a Vowel");
            } else {
                System.out.println("Input letter is a Constant");
            }
        }
    }


}
