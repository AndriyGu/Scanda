package by.gsu.epamlab.InterfaceTask.Task2;


public class ThirdSubAbstractPurchase extends AbstractPurchase{
  private int transportExpenses;

    public int getTransportExpenses() {
        return transportExpenses;
    }
    public void setTransportExpenses(int transportExpenses) {
        this.transportExpenses = transportExpenses;
    }

    public ThirdSubAbstractPurchase() {
        super();
        this.transportExpenses = 0;
    }

    public ThirdSubAbstractPurchase(Commodity commodity, int number, int transportExpenses) {
        super(commodity, number);
        this.transportExpenses = transportExpenses;
    }

    public int getCost(){
       int cost=super.getCommodity().getPrice()*super.getNumber()+transportExpenses;
       return cost;
   }
}
