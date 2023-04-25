package State;

import OP.*;

public class NoCups extends State{

    // constructor
    public NoCups(MDA_EFSM m, OP op){
        this.m = m;
        this.op = op;
    }

    void coin(int p){
        if (p != 0 && p != 1) {
            op.ReturnCoins();
        }
    }

    void insert_cups(int n){
        // if n > 0, k=n; ZeroCF
        if (n > 0) {
            m.setK(n);
            System.out.println(n + " cups available\n");
            op.ZeroCF();
            m.change_state(2);
        }
        else {
            System.out.println("Not enough cups. Try again after inserting cups.\n");
        }
    }

}
