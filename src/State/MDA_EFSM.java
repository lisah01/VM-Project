// This is the MDA-EFSM and the context class of the state pattern
package State;

import OP_Strategy.*;

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
        System.out.println("***MDA-EFSM->setK(n)***");
        this.k = n;
    }
    public int getK(){
        System.out.println("***MDA-EFSM->getK()***");
        return this.k;
    }

    // change states - decentralized so states will call for change of state
    public void change_state(int state){
        System.out.println("***MDA-EFSM->change_state(state))***");
        s = L[state];
        System.out.println("Current state: " + s.id + "\n");
    }

    public void create(){
        System.out.println("***MDA-EFSM->create()***");
        s.create();
    }

    public void coin(int p){
        System.out.println("***MDA-EFSM->coin(p)***");
        s.coin(p);
    }

    public void insert_cups(int n){
        System.out.println("***MDA-EFSM->insert_cups(n)***");
        s.insert_cups(n);
    }

    public void card(){
        System.out.println("***MDA-EFSM->card()***");
        s.card();
    }

    public void set_price(){
        System.out.println("***MDA-EFSM->set_price()***");
        s.set_price();
    }

    public void dispose_drink(int d){
        System.out.println("***MDA-EFSM->dispose_drink(d)***");
        s.dispose_drink(d);
    }

    public void additive(int a){
        System.out.println("***MDA-EFSM->additive(a)***");
        s.additive(a);
    }

    public void cancel(){
        System.out.println("***MDA-EFSM->cancel()***");
        s.cancel();
    }
}
