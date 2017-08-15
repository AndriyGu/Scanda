package by.gsu.epamlab.InterfaceTask.Task1;

/**
 * Created by AdanaC on 02.03.2017.
 */
public class FirstSubPurchase extends Purchase {


    static private int discount=10;

    public int getDiscount() {
        return discount;
    }


    public FirstSubPurchase() {

    }

    public FirstSubPurchase(String name, int price, int number) {
        super(name, price, number);

    }



    @Override
    public int getCost() {
        return (super.getPrice()-discount)*super.getNumber();
    }


}
