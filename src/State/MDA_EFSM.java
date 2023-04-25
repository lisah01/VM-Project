package State;

import OP.*;

public class MDA_EFSM {
    private State s;
    private State[] L = new State[4];
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
    }

    public void create(){
        s.create();
    }

    public void coin(int p){
        if (s != L[0]){
            s.coin(2);
        }
        else{
            s.coin(p);
        }
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
