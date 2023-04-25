import DataStore.DataStore;
import State.MDA_EFSM;

public class VM_1 {
    private DataStore d;
    private MDA_EFSM m;

    // constructor
    public VM_1(MDA_EFSM m, DataStore d) {
        this.m = m;
        this.d = d;
    }

    // create and set the price to p
    public void create(int p) {
        d.setTemp_p(p);
        m.create();
    }

    // insert coins
    public void coin(float v) {
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
        m.additive(1);
    }

    public void tea() {
        m.dispose_drink(1);
    }

    public void latte() {
        m.dispose_drink(2);
    }

    public void insert_cups(int n) {
        m.insert_cups(n);
    }

    public void set_price(float p) {
        d.setTempFloat_v(p);
        m.set_price();
    }

    public void cancel() {
        m.cancel();
    }
}
