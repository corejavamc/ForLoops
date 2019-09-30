import java.util.Scanner;

public class ReverseString {
    public static void main(String args[]){
        Scanner keybd = new Scanner(System.in);
        String origin = "", result ="";

        System.out.println("Enter a string: ");
        origin = keybd.nextLine();

        for (int i = origin.length()-1; i >= 0 ; i--){
            result = result + origin.charAt(i);
        }

        System.out.println("Original String: " + origin);
        System.out.println("Reversed String: " + result);
    }
}
