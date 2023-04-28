package OP_Strategy.Strategy;

public class DisposeAdditive1 implements DisposeAdditive{
    // takes additives list
    public void DisposeAdditive(int AL[]) {
        System.out.println("***DisposeAdditive1->DisposeAdditive(int AL[])***");
        // AL[0] = sugar -- defined in VM-1 class
        if (AL[0] == 1) {
            System.out.println("DISPOSE SUGAR");
        }
    }
}