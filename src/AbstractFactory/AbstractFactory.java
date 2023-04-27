// This is the Abstract Factory pattern
package AbstractFactory;

import DataStore.*;
import OP_Strategy.Strategy.*;

public interface AbstractFactory {
    DataStore getDataStore();

    StorePrice getStorePrice();

    ZeroCF getZeroCF();

    IncreaseCF getIncreaseCF();

    ReturnCoins getReturnCoins();

    DisposeDrink getDisposeDrink();

    DisposeAdditive getDisposeAdditive();
}