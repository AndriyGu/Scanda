package by.gsu.epamlab.InterfaceTask.Task1;

/**
 * Created by AdanaC on 03.03.2017.
 */
public class SecondSubPurchase extends Purchase{
    static private int percentDiscount=15;

    public int getPercentDiscount() {
        return percentDiscount;
    }


    public SecondSubPurchase() {

    }

    public SecondSubPurchase(String name, int price, int number) {
        super(name, price, number);
    }

    //500 * 20 * (1 – 5.825/100) = 9418

    public int getCost(){
        int i =super.getPrice()*super.getNumber()*(1-percentDiscount/100);
        return i;
    }
}
