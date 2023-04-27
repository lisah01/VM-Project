package State;

import OP.*;

public class Idle extends State{

    // constructor
    public Idle(MDA_EFSM m, OP op){
        this.m = m;
        this.op = op;
        this.id = "Idle State";
    }

    // if p == 0, not enough coins
    // if p == 1, create new additive list AL and move to coins inserted state
    void coin(int p){
        if (p == 0){
            System.out.println("Not enough coins\n");
            System.out.println("Current State: " + id + "\n");
            op.IncreaseCF();
        }
        else if (p == 1){
            op.IncreaseCF();
            m.AL = new int[3];
            m.change_state(3);
        }

    }

    // store price
    void set_price(){
        op.StorePrice();
    }

    // create new additive list AL and move to coins inserted state
    void card(){
        op.ZeroCF();
        m.AL = new int[3];
        m.change_state(3);
    }

    // insert n cups
    void insert_cups(int n){
        System.out.println("Current State: " + id + "\n");
        // if n > 0, k+=n
        if (n > 0) {
            m.setK(m.getK() + n);       // add to existing cups
            System.out.println(m.getK() + " cups available\n");
        }
        else {
            System.out.println("No cups inserted.\n");
        }
    }

}
