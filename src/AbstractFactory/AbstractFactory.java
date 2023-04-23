package AbstractFactory;

import DataStore.*;
import OP.Strategy.*;

public interface AbstractFactory {
    DataStore getDataStore();

    StorePrice getStorePrice();

    ZeroCF getZeroCf();

    IncreaseCF getIncreaseCF();

    ReturnCoins getReturnCoins();

    DisposeDrink getDisposeDrink();

    DisposeAdditive getDisposeAdditive();
}