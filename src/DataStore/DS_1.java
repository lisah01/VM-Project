// This is datastore 1
package DataStore;

public class DS_1 extends DataStore {
    // attributes
    private float temp_p;
    private float temp_v;
    private float price;
    private float cf;

    // getters and setters for DS_1
    public float getTemp_p() {
        System.out.println("***DS_1->getTemp_p***");
        return this.temp_p;
    }

    public void setTemp_p(float p) {
        System.out.println("***DS_1->setTemp_p(p)***");
        this.temp_p = p;
    }

    public float getTempFloat_v() {
        System.out.println("***DS_1->getTempFloat_v***");
        return this.temp_v;
    }

    public void setTempFloat_v(float v) {
        System.out.println("***DS_1->setTempFloat_v(v)***");
        this.temp_v = v;
    }

    public float getPrice() {
        System.out.println("***DS_1->getPrice***");
        return this.price;
    }

    public void setPrice(float price) {
        System.out.println("***DS_1->setPrice(price)***");
        this.price = price;
    }

    public float getFloatCF() {
        System.out.println("***DS_1->getFloatCF***");
        return this.cf;
    }

    public void setFloatCF(float cf) {
        System.out.println("***DS_1->setFloatCF(cf)***");
        this.cf = cf;
    }
}
