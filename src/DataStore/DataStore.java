// This is the abstract datastore
package DataStore;

 public abstract class DataStore {
    // Abstract getters and setters for all attributes in DS_1 and DS_2
    // These will be overwritten in the subclass datastores
     public float getTemp_p(){ return -1; }
     public void setTemp_p(float p){}
     public float getTempFloat_v(){ return -1; };
     public void setTempFloat_v(float v){}
     public int getTempInt_v(){ return -1; };
     public void setTempInt_v(int v){}
     public float getPrice(){ return -1; }
     public void setPrice(float price){}
     public float getFloatCF(){ return -1; }
     public void setFloatCF(float cf){}
     public int getIntCF(){ return -1; }
     public void setIntCF(int cf){}
}