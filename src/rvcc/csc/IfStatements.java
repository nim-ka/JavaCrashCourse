package rvcc.csc;
import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int x = keyboard.nextInt();
        int y = keyboard.nextInt();

        //Equals
        if(x ==  5) {
            System.out.println("Equal to 5");
        } else {
            System.out.println("Not equal to 5");
        }

        //Not equals
        if(x !=  5) {
            System.out.println("Not equal to 5");
        } else {
            System.out.println("Equal to 5");
        }

        //Logical and &&
        if(x == 5 && y != 6) {
            System.out.println("Yeet");
        } else if(x == 6 || y == 5) { //Logical or ||
            System.out.println("Yolk");
        } else {
            System.out.println("How did you mess that up?");
        }



    }
}
