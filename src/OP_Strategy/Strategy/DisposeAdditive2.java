package OP_Strategy.Strategy;

public class DisposeAdditive2 implements DisposeAdditive{
    // takes additives list
    public void DisposeAdditive(int AL[]) {
        System.out.println("***DisposeAdditive2->DisposeAdditive(int AL[])***");
        // AL[0] = SUGAR, AL[1] = CREAM -- defined in VM-2 class
        if (AL[0] == 1) {
            System.out.println("DISPOSE SUGAR");
        }
        if (AL[1] == 1){
            System.out.println("DISPOSE CREAM");
        }
    }
}