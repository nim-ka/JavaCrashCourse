package rvcc.csc;

public class Car {
    private String make, model;
    private int year;
    private int currentSpeed = 0;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void printCarInfo() {
        System.out.println(year + " " + make + " " + model);
    }

    void hitGas() {
        currentSpeed += 5;
        System.out.println("Current speed: " + currentSpeed + "mph");
    }

    void hitBrake() {
        if(currentSpeed >= 5) {
            currentSpeed -= 5;
            System.out.println("Current speed: " + currentSpeed + "mph");
        } else {
            System.out.println("You're already fully stopped!");
        }
    }

    int getSpeed() {
        return currentSpeed;
    }
}
