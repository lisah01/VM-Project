import State.MDA_EFSM;
import DataStore.*;

public class VM_2 {
    private MDA_EFSM m;
    private DataStore d;

    // constructor
    public VM_2(MDA_EFSM m, DataStore d) {
        this.m = m;
        this.d = d;
    }

    public void CREATE(float p){
        System.out.println("***VM-2->CREATE(p)***");
        d.setTemp_p(p);
        m.create();
    }

    public void COIN(int v){
        System.out.println("***VM-2->COIN(v)***");
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
        System.out.println("***VM-2->CARD(x)***");
        if (x >= d.getPrice()){
            m.card();
        }
    }

    public void SUGAR(){
        System.out.println("***VM-2->SUGAR()***");
        m.additive(0);
    }

    public void CREAM(){
        System.out.println("***VM-2->CREAM()***");
        m.additive(1);
    }

    public void COFFEE(){
        System.out.println("***VM-2->COFFEE()***");
        m.dispose_drink(0);
    }

    public void InsertCups(int n){
        System.out.println("***VM-2->InsertCups(n)***");
        m.insert_cups(n);
    }

    public void SetPrice(int p){
        System.out.println("***VM-2->SetPrice(p)***");
        d.setTemp_p(p);
        m.set_price();
    }

    public void CANCEL(){
        System.out.println("***VM-2->CANCEL()***");
        m.cancel();
    }
}