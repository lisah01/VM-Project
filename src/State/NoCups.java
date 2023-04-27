package State;

import OP_Strategy.*;

public class NoCups extends State {

    // constructor
    public NoCups(MDA_EFSM m, OP op) {
        this.m = m;
        this.op = op;
        this.id = "NoCups State";
    }

    public void coin(int p) {
        System.out.println("***NoCups->coin(p)***");
        op.IncreaseCF();
        System.out.println("Not enough cups. Try again after inserting cups.");
        op.ReturnCoins();
        op.ZeroCF();
        System.out.println("Current State: " + id + "\n");
    }

    public void insert_cups(int n) {
        System.out.println("***NoCups->insert_cups(n)***");
        // if n > 0, k=n; ZeroCF
        if (n > 0) {
            m.setK(n);
            System.out.println(n + " cups available");
            op.ZeroCF();
            m.change_state(2);
        } else {
            System.out.println("Not enough cups. Try again after inserting cups.");
            System.out.println("Current State: " + id + "\n");
        }
    }
}
