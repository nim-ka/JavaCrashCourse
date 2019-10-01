package rvcc.csc;
import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num = keyboard.nextInt();
        switch(num) {
            case 1:
                System.out.println("you said 1!");
                break;
            case 2:
                System.out.println("You said 2!");
                break;
            default:
                System.out.println("You said something!");
        }

    }
}
