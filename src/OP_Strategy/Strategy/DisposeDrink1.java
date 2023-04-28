package OP_Strategy.Strategy;

public class DisposeDrink1 implements DisposeDrink {

    public void DisposeDrink(int drink) {
        System.out.println("***DisposeDrink1->DisposeDrink(int drink)***");
        // 0 = tea, 1 = latte -- defined in VM-1 class
        if (drink == 0) {
            System.out.println("DISPOSE A CUP OF TEA");
        }
        if (drink == 1) {
            System.out.println("DISPOSE A CUP OF LATTE");
        }
    }
}