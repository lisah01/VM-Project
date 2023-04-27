package State;

import OP_Strategy.*;

public class CoinsInserted extends State{

    // constructor
    public CoinsInserted(MDA_EFSM m, OP op){
        this.m = m;
        this.op = op;
        this.id = "CoinsInserted State";
    }

    // return extra coins
    public void coin(int p){
        System.out.println("***CoinsInserted->coin(p)***");
        op.ReturnCoins();
        System.out.println("Current State: " + id + "\n");
    }

    // cancel current interaction
    public void cancel(){
        System.out.println("***CoinsInserted->cancel()***");
        op.IncreaseCF();
        op.ReturnCoins();
        op.ZeroCF();
        m.change_state(2);              // move back to idle state
    }

    // dispose a drink
    public void dispose_drink(int d){
        System.out.println("***CoinsInserted->dispose_drink(d))***");
        if (m.getK() > 1) {
            op.DisposeDrink(d);
            op.DisposeAdditive(m.AL);
            m.setK(m.getK() - 1);       // reduce cups
            op.ZeroCF();                // disposing drink consumes all coins
            System.out.println(m.getK() + " cups remaining.\n");
            m.change_state(2);          // move back to idle state
        }
        else if (m.getK() <= 1){
            op.DisposeDrink(d);
            op.DisposeAdditive(m.AL);   // prints appropriate additive messages
            op.ZeroCF();
            m.change_state(1);          // out of cups, move to no cups state
        }
    }

    // choose additives where 0 = not chosen, 1 = additive chosen
    public void additive(int a){
        System.out.println("***CoinsInserted->additive(a)***");
        System.out.println("Current State: " + id + "\n");
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
