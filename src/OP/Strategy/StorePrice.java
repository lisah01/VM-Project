package OP.Strategy;

import DataStore.*;

public interface StorePrice {
    DataStore getDataStore();

    void setDataStore(DataStore d);

    void StorePrice();
}
