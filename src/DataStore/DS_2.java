package DataStore;

public class DS_2 extends DataStore {
    // attributes
    float temp_p;
    int temp_v;
    float price;
    int cf;

    // getters and setters
    public float getTemp_p(){
        return this.temp_p;
    }

    public void setTemp_p(float p){
        this.temp_p = p;
    }

    public int getTempInt_v(){
        return this.temp_v;
    }

    public void setTempInt_v(int v){
        this.temp_v = v;
    }

    public float getPrice(){
        return this.price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public int getIntCF(){
        return this.cf;
    }

    public void setIntCF(int cf){
        this.cf = cf;
    }

    // not applicable to DS_2
    public float getTempFloat_v(){return -1;}
    public void setTempFloat_v(float v){}
    public float getFloatCF(){return -1;}
    public void setFloatCF(float cf){}
}
