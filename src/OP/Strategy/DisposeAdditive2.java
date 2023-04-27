package OP.Strategy;

public class DisposeAdditive2 implements DisposeAdditive{
    public void DisposeAdditive(int AL[]) {
        // AL[1] = SUGAR, AL[2] = CREAM
        if (AL[1] == 1) {
            System.out.println("DISPOSE SUGAR (DisposeAdditive2 class)");
        }
        if (AL[2] == 1){
            System.out.println("DISPOSE CREAM");
        }
    }
}