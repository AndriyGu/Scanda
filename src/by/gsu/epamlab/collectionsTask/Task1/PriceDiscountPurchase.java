package by.gsu.epamlab.collectionsTask.Task1;

/**
 * Created by AdanaC on 21.03.2017.
 */
public class PriceDiscountPurchase  extends Purchase {


        private int discount;

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
            return discount;
        }


        public PriceDiscountPurchase() {

        }

        public PriceDiscountPurchase(String name, int price, int number, int discount) {
            super(name, price, number);
            this.discount = discount;

        }



        @Override
        public int getCost() {
            return (super.getPrice()-discount)*super.getNumber();
        }




}
