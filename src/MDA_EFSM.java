public class MDA_EFSM {
    int k;
    int A[];
    protected void create(){}
    protected void insert_cups(int n){}
    protected void coin(int f){
        if (f==0){
            // insufficient funds
        }
        else if (f==1){
            // sufficient funds
        }
        else{
            System.out.println("Error in MDA-EFSM coin()");
        }
    }
    protected void card(){}
    protected void cancel(){}
    protected void set_price(){}
    protected void dispose_drink(int d){}
    protected void additive(int a){}
}
