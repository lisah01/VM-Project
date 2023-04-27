package OP_Strategy.Strategy;

public class DisposeDrink1 implements DisposeDrink {

    public void DisposeDrink(int d) {
        System.out.println("***DisposeDrink1->DisposeDrink(int d)***");
        if (d == 0) {
            System.out.println("DISPOSE A CUP OF TEA");
        }
        if (d == 1) {
            System.out.println("DISPOSE A CUP OF LATTE");
        }
    }
}