// This is the output processor
package OP_Strategy;

import AbstractFactory.*;
import DataStore.*;
import OP_Strategy.Strategy.*;

public class OP {
    private AbstractFactory af;
    private DataStore d;
    private StorePrice a1;
    private ZeroCF a2;
    private IncreaseCF a3;
    private ReturnCoins a4;
    private DisposeDrink a5;
    private DisposeAdditive a6;

    // constructor to initialize OP with known AF
    public OP(AbstractFactory af, DataStore d){
        this.af = af;
        this.a1 = af.getStorePrice();
        this.a2 = af.getZeroCF();
        this.a3 = af.getIncreaseCF();
        this.a4 = af.getReturnCoins();
        this.a5 = af.getDisposeDrink();
        this.a6 = af.getDisposeAdditive();
        this.d = d;
    }

    public void StorePrice(){
        System.out.println("***OP->StorePrice()***");
        this.a1.StorePrice(d);
    }

    public void ZeroCF(){
        System.out.println("***OP->ZeroCF()***");
        this.a2.ZeroCF(d);
    }

    public void IncreaseCF(){
        System.out.println("***OP->IncreaseCF()***");
        this.a3.IncreaseCF(d);
    }

    public void ReturnCoins(){
        System.out.println("***OP->ReturnCoins()***");
        this.a4.ReturnCoins();
    }

    public void DisposeDrink(int drink){
        System.out.println("***OP->DisposeDrink(drink)***");
        this.a5.DisposeDrink(drink);
    }

    public void DisposeAdditive(int AL[]){
        this.a6.DisposeAdditive(AL);
    }
}
