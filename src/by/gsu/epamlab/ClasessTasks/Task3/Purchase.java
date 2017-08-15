package by.gsu.epamlab.ClasessTasks.Task3;

/**
 * Created by AdanaC on 03.03.2017.
 */
public class Purchase implements  Comparable<Purchase> {

    private String name;
    private int price;
    private int number;
    private EnumWeek day;

    public Purchase() {
        this.name = null;
        this.price = 0;
        this.number = 0;
        this.day = null;
    }

    public Purchase(String name, int price, int number, EnumWeek day) {
        this.name = name;
        this.price = price;
        this.number = number;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public EnumWeek getDay() {
        return day;
    }

    public void setDay(EnumWeek day) {
        this.day = day;
    }

    public int getCost(){

        int cost =0;
        return cost;
    };

    public String toString(){
        return ""+name+";"+price+";"+number+";"+day;
    }


    @Override
    public int compareTo(Purchase purchase) {
        int i = Integer.signum(number-purchase.number);
        return i;
    }
}
