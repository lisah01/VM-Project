package OP_Strategy.Strategy;

public class DisposeDrink2 implements DisposeDrink{
    public void DisposeDrink(int d) {
        System.out.println("***DisposeDrink2->DisposeDrink(int d)***");
        if (d == 0) {
            System.out.println("DISPOSE A CUP OF COFFEE");
        }
    }
}