// This is the concrete factory for VM 2
package AbstractFactory;

import DataStore.DataStore;
import DataStore.DS_2;
import OP_Strategy.Strategy.*;

public class VM2_Factory implements AbstractFactory {
    // These methods return the appropriate classes for DS_2
    public DataStore getDataStore(){
        System.out.println("***VM2_Factory->getDataStore***");
        return new DS_2();
    }

    public StorePrice getStorePrice(){
        System.out.println("***VM2_Factory->getStorePrice***");
        return new StorePrice2();
    }

    public ZeroCF getZeroCF(){
        System.out.println("***VM2_Factory->getZeroCF***");
        return new ZeroCF2();
    }

    public IncreaseCF getIncreaseCF(){
        System.out.println("***VM2_Factory->getIncreaseCF***");
        return new IncreaseCF2();
    }

    public ReturnCoins getReturnCoins(){
        System.out.println("***VM2_Factory->getReturnCoins***");
        return new ReturnCoins2();
    }
    
    public DisposeDrink getDisposeDrink(){
        System.out.println("***VM2_Factory->getDisposeDrink***");
        return new DisposeDrink2();
    }

    public DisposeAdditive getDisposeAdditive(){
        System.out.println("***VM2_Factory->getDisposeAdditive***");
        return new DisposeAdditive2();
    }
}
