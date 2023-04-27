// This is the concrete factory for VM 1
package AbstractFactory;

import DataStore.DataStore;
import DataStore.DS_1;
import OP_Strategy.Strategy.*;

public class VM1_Factory implements AbstractFactory {
    // These methods return the appropriate classes for DS_1
    public DataStore getDataStore(){
        System.out.println("***VM1_Factory->getDataStore***");
        return new DS_1();
    }

    public StorePrice getStorePrice(){
        System.out.println("***VM1_Factory->getStorePrice***");
        return new StorePrice1();
    }

    public ZeroCF getZeroCF(){
        System.out.println("***VM1_Factory->getZeroCF***");
        return new ZeroCF1();
    }

    public IncreaseCF getIncreaseCF(){
        System.out.println("***VM1_Factory->getIncreaseCF***");
        return new IncreaseCF1();
    }

    public ReturnCoins getReturnCoins(){
        System.out.println("***VM1_Factory->getReturnCoins***");
        return new ReturnCoins1();
    }

    public DisposeDrink getDisposeDrink(){
        System.out.println("***VM1_Factory->getDisposeDrink***");
        return new DisposeDrink1();
    }

    public DisposeAdditive getDisposeAdditive(){
        System.out.println("***VM1_Factory->getDisposeAdditive***");
        return new DisposeAdditive1();
    }
}