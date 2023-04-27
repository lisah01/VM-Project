package OP.Strategy;

public class DisposeDrink1 implements DisposeDrink {

    public void DisposeDrink(int d) {
        if (d == 1) {
            System.out.println("DISPOSE A CUP OF TEA");
        }
        if (d == 2) {
            System.out.println("DISPOSE A CUP OF LATTE");
        }
    }
}