package OP_Strategy.Strategy;

public class DisposeDrink2 implements DisposeDrink{
    public void DisposeDrink(int drink) {
        System.out.println("***DisposeDrink2->DisposeDrink(int drink)***");
        // 0 = coffee -- defined in VM-2 class
        if (drink == 0) {
            System.out.println("DISPOSE A CUP OF COFFEE");
        }
    }
}