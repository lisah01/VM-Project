package OP.Strategy;

import DataStore.*;

public interface DisposeAdditive {
    DataStore getDataStore();

    void setDataStore(DataStore d);

    void DisposeAdditive(int AL[]);
}