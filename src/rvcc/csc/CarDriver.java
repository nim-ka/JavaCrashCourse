package rvcc.csc;
import java.util.Scanner;

public class CarDriver {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        Car car = new Car("Honda", "Civic", 2004);
        car.printCarInfo();

        String driver;
        do {
            System.out.println("Do you wanna hit the gas(g) or brake(b) or leave(no)?");
            driver = keyboard.nextLine();

            switch(driver) {
                case "g":
                    car.hitGas();
                    break;
                case "b":
                    car.hitBrake();
                case "no":
                    break;
                default:
                    System.out.println("Please enter a valid input!");
            }

        }while(!driver.equals("no"));

        if(car.getSpeed() != 0) {
            System.out.println("Congrats, you jumped out of a moving car, dummy.");
        } else {
            System.out.println("Wow, you actually waited for the car to stop before getting out! *slow clap*");
        }

    }
}
