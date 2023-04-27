package State;

import OP.*;

public class NoCups extends State {

    // constructor
    public NoCups(MDA_EFSM m, OP op) {
        this.m = m;
        this.op = op;
        this.id = "NoCups State";
    }

    void coin(int p) {
        op.IncreaseCF();
        System.out.println("Not enough cups. Try again after inserting cups.");
        op.ReturnCoins();
        op.ZeroCF();
        System.out.println("Current State: " + id + "\n");
    }

    void insert_cups(int n) {
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
