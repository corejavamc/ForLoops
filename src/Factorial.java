/*
 * Factorial of a Number: You are going to write an application to determine the factorial of a single number.
 * A factorial of an integer is the product of that integer and all the integers below it. For example,
 * the factorial of 4 is (4 x 3 x 2 x 1 = 24). User will be required to enter an integer.
 * You will then calculate the factorial of that integer and print the result to the screen.
 */

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]) {

        Scanner keybd = new Scanner(System.in);
        System.out.println("Enter a number to find its factorial number:");
        int numb = keybd.nextInt();
        int sum = 1;
        String result = "Factorial of " + numb + " is (";

        for (int i = numb; i >= 1; i--){
            result = result + i ;
            sum = sum * i;
            if ( i != 1)
                result = result + " x ";
        }

        result = result + ") = " + sum;
        System.out.println(result);

    }
}
