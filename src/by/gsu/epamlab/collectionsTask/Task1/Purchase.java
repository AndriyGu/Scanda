package by.gsu.epamlab.collectionsTask.Task1;

/**
 * Created by AdanaC on 02.03.2017.
 */
public class Purchase {
    private String name;
    private int price;
    private int number;

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

    public Purchase() {
        this.name = null;
        this.price = 0;
        this.number = 0;
    }
    public Purchase(String name, int price, int number) {
        this.name = name;
        this.price = price;
        this.number = number;
    }



    public int getCost(){
        int cost = price*number;
        return cost;
    }

    public String toString(){
        return  ""+name+";"+price+";"+number+";"+getCost();
    }

    public boolean equals(Purchase purchase2){
        if (name.equals(purchase2.getName()) && price==purchase2.getPrice()){return true;}
        else {return false;}
    }


}
