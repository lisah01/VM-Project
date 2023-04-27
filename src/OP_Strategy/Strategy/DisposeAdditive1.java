package OP_Strategy.Strategy;

public class DisposeAdditive1 implements DisposeAdditive{
    public void DisposeAdditive(int AL[]) {
        System.out.println("***DisposeAdditive1->DisposeAdditive(int AL[])***");
        if (AL[0] == 1) {
            System.out.println("DISPOSE SUGAR (DisposeAdditive1 class)");
        }
    }
}