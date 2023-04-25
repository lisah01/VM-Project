// This is the concrete factory for VM 1
package AbstractFactory;

import DataStore.DataStore;
import DataStore.DS_1;
import OP.Strategy.*;

public class VM1_Factory implements AbstractFactory {
    // These methods return the appropriate classes for DS_1
    public DataStore getDataStore(){
        return new DS_1();
    }

    public StorePrice getStorePrice(){
        return new StorePrice1();
    }

    public ZeroCF getZeroCf(){
        return new ZeroCF1();
    }

    public IncreaseCF getIncreaseCF(){
        return new IncreaseCF1();
    }

    public ReturnCoins getReturnCoins(){
        return new ReturnCoins1();
    }

    public DisposeDrink getDisposeDrink(){
        return new DisposeDrink1();
    }

    public DisposeAdditive getDisposeAdditive(){
        return new DisposeAdditive1();
    }
    
}
