package State;

import OP.*;

public class CoinsInserted extends State{

    // constructor
    public CoinsInserted(MDA_EFSM m, OP op){
        this.m = m;
        this.op = op;
    }

    // return extra coins
    void coin(int p){
        op.ReturnCoins();
    }

    // cancel current interaction
    void cancel(){
        op.IncreaseCF();
        op.ReturnCoins();
        op.ZeroCF();
        System.out.println("Transaction cancelled.\n");
        m.change_state(2);              // move back to idle state
    }

    // dispose a drink
    void dispose_drink(int d){
        if (m.getK() > 1) {
            op.DisposeDrink(d);
            op.DisposeAdditive(m.AL);
            m.setK(m.getK() - 1);       // reduce cups
            System.out.println(m.getK() + " cups remaining.\n");
            m.change_state(2);          // move back to idle state
        }
        else if (m.getK() <= 1){
            op.DisposeDrink(d);
            op.DisposeAdditive(m.AL);
            op.ZeroCF();
            System.out.println("Insert more cups to continue.\n");
            m.change_state(1);          // out of cups, move to no cups state
        }
    }

    // choose additives where 0 = not chosen, 1 = additive chosen
    void additive(int a){
        if (m.AL[a] == 0){
            m.AL[a] = 1;
            System.out.println("Additive selected.\n");
        }
        else {
            m.AL[a] = 0;
            System.out.println("Additive deselected.\n");
        }
    }

}
