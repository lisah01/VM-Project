// This is the MDA-EFSM and the context class of the state pattern
package State;

import OP.*;

public class MDA_EFSM {
    private State s;
    private State[] L;
    private int k = 0;
    public int AL[];

    public MDA_EFSM(OP op){
        this.L = new State[4];
        this.L[0] = new Start(this, op);
        this.L[1] = new NoCups(this, op);
        this.L[2] = new Idle(this, op);
        this.L[3] = new CoinsInserted(this, op);

        // default start
        this.s = L[0];
    }

    // setter and getter for k
    public void setK(int n){
        this.k = n;
    }
    public int getK(){
        return this.k;
    }

    // change states
    public void change_state(int state){
        s = L[state];
        System.out.println("Current state: " + s.id + "\n");
    }

    public void create(){
        s.create();
    }

    public void coin(int p){
            s.coin(p);
    }

    public void insert_cups(int n){
        s.insert_cups(n);
    }

    public void card(){
        s.card();
    }

    public void set_price(){
        s.set_price();
    }

    public void dispose_drink(int d){
        s.dispose_drink(d);
    }

    public void additive(int a){
        s.additive(a);
    }

    public void cancel(){
        s.cancel();
    }
}
