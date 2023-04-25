// This is datastore 1
package DataStore;

public class DS_1 extends DataStore {
    // attributes
    private float temp_p;
    private float temp_v;
    private float price;
    private float cf;

    // getters and setters for DS_1
    public float getTemp_p(){
        return this.temp_p;
    }

    public void setTemp_p(float p){
        this.temp_p = p;
    }

    public float getTempFloat_v(){
        return this.temp_v;
    }

    public void setTempFloat_v(float v){
        this.temp_v = v;
    }

    public float getPrice(){
        return this.price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public float getFloatCF(){
        return this.cf;
    }

    public void setFloatCF(float cf){
        this.cf = cf;
    }

    // not applicable to DS_1
    public int getTempInt_v(){return -1;}
    public void setTempInt_v(int v){}
    public int getIntCF(){return -1;}
    public void setIntCF(int cf){};
}
