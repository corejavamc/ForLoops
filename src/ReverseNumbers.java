/*
 * Write a program that prints the specified number backwards.
 */

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String args[]) {
        int userInput;
        Scanner keybd = new Scanner(System.in);
        System.out.println("Enter a number: ");
        userInput = keybd.nextInt();
        keybd.nextLine();

        for (int i = userInput; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
}