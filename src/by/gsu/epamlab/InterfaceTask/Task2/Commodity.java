package by.gsu.epamlab.InterfaceTask.Task2;

/**
 * Created by AdanaC on 03.03.2017.
 */
public class Commodity {
    private String name;
    private int price;

    public Commodity() {
        this.name =null;
        this.price = 0;
    }

    public Commodity(String name, int price) {
        this.name = name;
        this.price = price;
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

    public String toString(){
        return ""+name+";"+price;
    }

}
