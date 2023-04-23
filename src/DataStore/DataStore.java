package DataStore;

public abstract class DataStore {
    // abstract getters and setters for all attributes in DS_1 and DS_2
    public abstract float getTemp_p();
    public abstract void setTemp_p(float p);
    public abstract float getTempFloat_v();
    public abstract void setTempFloat_v(float v);
    public abstract int getTempInt_v();
    public abstract void setTempInt_v(int v);
    public abstract float getPrice();
    public abstract void setPrice(float price);
    public abstract float getFloatCF();
    public abstract void setFloatCF(float cf);
    public abstract int getIntCF();
    public abstract void setIntCF(int cf);
}
