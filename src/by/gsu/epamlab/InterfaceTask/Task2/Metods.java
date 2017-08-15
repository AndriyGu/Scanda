package by.gsu.epamlab.InterfaceTask.Task2;

/**
 * Created by AdanaC on 06.03.2017.
 */
public class Metods {
    int minCost = 0;

    static public void printArr(AbstractPurchase[] abstractPurchases) {

        for (AbstractPurchase a : abstractPurchases) {

            try {
                ((FirstSubAbstractPurchase) a).getDiscount();
                System.out.println(a.getCommodity().toString() + ";" + a.getNumber() + ";" +
                        ((FirstSubAbstractPurchase) a).getCost());
            } catch (Exception E) {
            }

            try {
                ((SeconSsubAbstraktPurches) a).getDiscountPercent();
                System.out.println(a.getCommodity().toString() + ";" + a.getNumber() + ";" +
                        ((SeconSsubAbstraktPurches) a).getCost());
            } catch (Exception E) {
            }

            try {
                ((ThirdSubAbstractPurchase) a).getTransportExpenses();
                System.out.println(a.getCommodity().toString() + ";" + a.getNumber() + ";" +
                        ((ThirdSubAbstractPurchase) a).getCost());
            } catch (Exception E) {
            }
        }
    }

    public int minCost(AbstractPurchase[] abstractPurchases) {
        for (AbstractPurchase a : abstractPurchases) {

            try {
                ((FirstSubAbstractPurchase) a).getDiscount();
                /*System.out.println(a.getCommodity().toString() + ";" + a.getNumber() + ";" +
                        ((FirstSubAbstractPurchase) a).getCost());*/
                if (minCost == 0 || minCost > ((FirstSubAbstractPurchase) a).getCost()) {
                    minCost = ((FirstSubAbstractPurchase) a).getCost();
                }
            } catch (Exception E) {
            }

            try {
                ((SeconSsubAbstraktPurches) a).getDiscountPercent();
                /*System.out.println(a.getCommodity().toString() + ";" + a.getNumber() + ";" +
                        ((SeconSsubAbstraktPurches) a).getCost());*/
                if (minCost == 0 || minCost > ((SeconSsubAbstraktPurches) a).getCost()) {
                    minCost = ((SeconSsubAbstraktPurches) a).getCost();
                }
            } catch (Exception E) {
            }

            try {
                ((ThirdSubAbstractPurchase) a).getTransportExpenses();
                /*System.out.println(a.getCommodity().toString() + ";" + a.getNumber() + ";" +
                        ((ThirdSubAbstractPurchase) a).getCost());*/
                if (minCost == 0 || minCost > ((ThirdSubAbstractPurchase) a).getCost()) {
                    minCost = ((ThirdSubAbstractPurchase) a).getCost();
                }
            } catch (Exception E) {
            }
        }
        return minCost;
    }

}




