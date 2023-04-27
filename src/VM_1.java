import State.MDA_EFSM;
import DataStore.*;

public class VM_1 {
    private MDA_EFSM m;
    private DataStore d;

    // constructor
    public VM_1(MDA_EFSM m, DataStore d) {
        this.m = m;
        this.d = d;
    }

    // create and set the price to p
    public void create(int p) {
        System.out.println("***VM-1->create(p)***");
        d.setTemp_p(p);
        m.create();
    }

    // insert coins
    public void coin(float v) {
        System.out.println("***VM-1->coin(v)***");
        d.setTempFloat_v(v);
        if (d.getFloatCF() + v >= d.getPrice()) {
            m.coin(1);
        }
        // else insufficient coins
        else {
            m.coin(0);

        }
    }

    public void sugar() {
        System.out.println("***VM-1->sugar()***");
        m.additive(0);
    }

    public void tea() {
        System.out.println("***VM-1->tea()***");
        m.dispose_drink(0);
    }

    public void latte() {
        System.out.println("***VM-1->latte()***");
        m.dispose_drink(1);
    }

    public void insert_cups(int n) {
        System.out.println("***VM-1->insert_cups(n)***");
        m.insert_cups(n);
    }

    public void set_price(float p) {
        System.out.println("***VM-1->set_price(p)***");
        d.setTempFloat_v(p);
        m.set_price();
    }

    public void cancel() {
        System.out.println("***VM-1->cancel()***");
        m.cancel();
    }
}
