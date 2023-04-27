// This is datastore 2
package DataStore;

public class DS_2 extends DataStore {
    // attributes
    float temp_p;
    int temp_v;
    float price;
    int cf;

    // getters and setters
    public float getTemp_p(){
        System.out.println("***DS_2->getTemp_p***");
        return this.temp_p;
    }

    public void setTemp_p(float p){
        System.out.println("***DS_2->setTemp_p***");
        this.temp_p = p;
    }

    public int getTempInt_v(){
        System.out.println("***DS_2->getInt_v***");
        return this.temp_v;
    }

    public void setTempInt_v(int v){
        System.out.println("***DS_2->setInt_v***");
        this.temp_v = v;
    }

    public float getPrice(){
        System.out.println("***DS_2->getPrice***");
        return this.price;
    }

    public void setPrice(float price){
        System.out.println("***DS_2->setPrice***");
        this.price = price;
    }

    public int getIntCF(){
        System.out.println("***DS_2->getIntCF***");
        return this.cf;
    }

    public void setIntCF(int cf){
        System.out.println("***DS_2->setIntCF***");
        this.cf = cf;
    }
}