/*
 * This program will display the numbers from 1 to user specified number and
 * their squares using a for loop
 */

import java.util.Scanner;

public class Square {
    public static void main(String args[]) {
        Scanner keybd = new Scanner(System.in);
        int userInput;

        System.out.println("Enter a number: ");
        userInput = keybd.nextInt();

        System.out.println("Number\tSquare\n------\t------");

        for (int i = 1; i <= userInput; i++) {
            System.out.println("\t" + i + "\t" + (i*i));
        }
    }
}