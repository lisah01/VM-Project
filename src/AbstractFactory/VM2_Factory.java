// This is the concrete factory for VM 2
package AbstractFactory;

import DataStore.DataStore;
import DataStore.DS_2;
import OP.Strategy.*;

public class VM2_Factory implements AbstractFactory {
    // These methods return the appropriate classes for DS_2
    public DataStore getDataStore(){
        return new DS_2();
    }

    public StorePrice getStorePrice(){
        return new StorePrice2();
    }

    public ZeroCF getZeroCf(){
        return new ZeroCF2();
    }

    public IncreaseCF getIncreaseCF(){
        return new IncreaseCF2();
    }

    public ReturnCoins getReturnCoins(){
        return new ReturnCoins2();
    }

    public DisposeDrink getDisposeDrink(){
        return new DisposeDrink2();
    }

    public DisposeAdditive getDisposeAdditive(){
        return new DisposeAdditive2();
    }
}
