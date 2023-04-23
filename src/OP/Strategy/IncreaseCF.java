package OP.Strategy;

import DataStore.*;

public interface IncreaseCF {
    DataStore getDataStore();

    void setDataStore(DataStore d);

    void IncreaseCF();
}