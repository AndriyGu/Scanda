package by.gsu.epamlab.InterfaceTask.Task2;

/**
 * Created by AdanaC on 03.03.2017.
 */
abstract public class AbstractPurchase implements Comparable<AbstractPurchase> {
    private Commodity commodity;
    private int number;

    public AbstractPurchase() {
        this.commodity = null;
        this.number = 0;
    }

    public AbstractPurchase(Commodity commodity, int number) {
        this.commodity = commodity;
        this.number = number;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    abstract public int getCost();

    public String toString(){
        return ""+commodity.toString()+";"+number+";"+getCost();
    }

    public int compareTo(AbstractPurchase purchase){
        int s=Integer.signum(getCost()-purchase.getCost());
        return s;
    }

}
