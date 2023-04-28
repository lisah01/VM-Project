package State;

import OP_Strategy.*;

public class Idle extends State{

    // constructor
    public Idle(MDA_EFSM m, OP op){
        this.m = m;
        this.op = op;
        this.id = "Idle State";
    }

    // if p == 0, not enough coins
    // if p == 1, create new additive list AL and move to coins inserted state
    public void coin(int p){
        System.out.println("***Idle->coin(p)***");
        op.IncreaseCF();
        if (p == 0){
            System.out.println("Not enough coins\n");
            System.out.println("Current State: " + id + "\n");
        }
        else if (p == 1){
            m.AL = new int[3];
            m.change_state(3);
        }

    }

    // store price
    public void set_price(){
        System.out.println("***Idle->set_price()***");
        op.StorePrice();
    }

    // create new additive list AL and move to coins inserted state
    public void card(){
        System.out.println("***Idle->card()***");
        System.out.println("Value deducted from card.");
        m.AL = new int[3];
        m.change_state(3);
    }

    // insert n cups
    public void insert_cups(int n){
        System.out.println("***Idle->insert_cups(n)***");
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
