import java.util.Scanner;

public class Factors {
    public static void main(String args[]){
        Scanner keybd = new Scanner(System.in);
        int numb;

        System.out.println("Enter a number: ");
        numb = keybd.nextInt();
        keybd.nextLine();

        for (int i = 1; i < numb; i++)
            if ((numb % i) == 0) {
                System.out.println(i + " is a factor of " + numb);
            }


    }
}
