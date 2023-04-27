package OP.Strategy;

public class DisposeDrink2 implements DisposeDrink{
    public void DisposeDrink(int d) {
        if (d == 0) {
            System.out.println("DISPOSE A CUP OF COFFEE");
        }
    }
}