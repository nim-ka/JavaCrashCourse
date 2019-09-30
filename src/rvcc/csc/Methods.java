package rvcc.csc;

public class Methods {
    public static void main(String[] args) {

    }

    //Function named do_something() and prints out "Doing Something!"
    void do_something() {
        System.out.println("Doing something!");
    }

    int return_something() {
        return 5;
    }

    int doubler(int x) {
        return 2*x;
    }


    /*
        Function called exponential
        Takes in 2 parameters called b and x
        b is the base of the exponent
        x is the exponent
        returns b^x
     */
    int exponential(int b, int x) {
        return b^x;
    }
}