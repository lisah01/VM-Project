import DataStore.DataStore;
import State.MDA_EFSM;

public class VM_2 {
    private DataStore d;
    private MDA_EFSM m;

    // constructor
    public VM_2(MDA_EFSM m, DataStore d) {
        this.m = m;
        this.d = d;
    }
    public void CREATE(float p){
        d.setTemp_p(p);
        m.create();
    }

    public void COIN(int v){
        d.setTempInt_v(v);
        if (d.getIntCF() + v >= d.getPrice()){
            m.coin(1);
        }
        // else insufficient coins
        else{
            m.coin(0);
        }
    }

    public void CARD(int x){
        if (x >= d.getPrice()){
            m.card();
        }
    }

    public void SUGAR(){
        m.additive(2);
    }

    public void CREAM(){
        m.additive(2);
    }

    public void COFFEE(){
        m.dispose_drink(1);
    }

    public void InsertCups(int n){
        m.insert_cups(n);
    }

    public void SetPrice(int p){
        d.setTemp_p(p);
        m.set_price();
    }

    public void CANCEL(){
        m.cancel();
    }
}
