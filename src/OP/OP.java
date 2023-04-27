// This is the output processor
package OP;

import AbstractFactory.*;
import DataStore.*;
import OP.Strategy.*;

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
        this.d = d;
        this.a1 = af.getStorePrice();
        this.a2 = af.getZeroCf();
        this.a3 = af.getIncreaseCF();
        this.a4 = af.getReturnCoins();
        this.a5 = af.getDisposeDrink();
        this.a6 = af.getDisposeAdditive();
    }

    public void StorePrice(){
        this.a1.setDataStore(this.d);
        this.a1.StorePrice();
    }

    public void ZeroCF(){
        this.a2.setDataStore(this.d);
        this.a2.ZeroCF();
    }

    public void IncreaseCF(){
        this.a3.setDataStore(this.d);
        this.a3.IncreaseCF();
    }

    public void ReturnCoins(){
        this.a4.ReturnCoins();
    }

    public void DisposeDrink(int d){
        this.a5.DisposeDrink(d);
    }

    public void DisposeAdditive(int AL[]){
        this.a6.DisposeAdditive(AL);
    }

    public DataStore getDataStore(){
        return this.d;
    }

    public void setDataStore(DataStore d){
        this.d = d;
    }
}
