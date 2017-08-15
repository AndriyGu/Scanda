package by.gsu.epamlab.InterfaceTask.Task2;

/**
 * Created by AdanaC on 03.03.2017.
 */
public class FirstSubAbstractPurchase extends AbstractPurchase {

    static private int discount=135;

    public int getDiscount() {
        return discount;
    }


    @Override
    public int getCost() {
        int cost=(super.getCommodity().getPrice()-discount)*super.getNumber();
        return cost;
    }

    public FirstSubAbstractPurchase() {

    }

    public FirstSubAbstractPurchase(Commodity commodity, int number) {
        super(commodity, number);

    }
}
