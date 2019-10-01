package rvcc.csc;
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

//        System.out.println("Say 'close'");
//        String close = keyboard.nextLine();
//        while(!close.equals("close")) {
//            System.out.println("You rebel, say 'close'!");
//            close = keyboard.nextLine();
//        }

        String close;
        do{
            System.out.println("Say 'close'");
            close = keyboard.nextLine();
        }
        while(!close.equals("close"));
    }
}
