package by.gsu.epamlab.InterfaceTask.Task2;

public class SeconSsubAbstraktPurches extends AbstractPurchase{
   static private int numperForDiscount = 3;
   static private int discountPercent = 10;

    public static int getNumperForDiscount() {
        return numperForDiscount;
    }
    public static int getDiscountPercent() {
        return discountPercent;
    }

    public int getCost(){
        if (super.getNumber()<numperForDiscount){
            return super.getCommodity().getPrice()*super.getNumber();

        }
        else {return (int) (super.getCommodity().getPrice()*super.getNumber()*(1-((double)discountPercent/100)));}
       };

    public SeconSsubAbstraktPurches() {
    }

    public SeconSsubAbstraktPurches(Commodity commodity, int number) {
        super(commodity, number);
    }

}
