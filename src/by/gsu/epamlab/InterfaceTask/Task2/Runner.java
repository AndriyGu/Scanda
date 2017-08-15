package by.gsu.epamlab.InterfaceTask.Task2;

import java.sql.Array;
import java.util.Arrays;

/**
 * Created by AdanaC on 06.03.2017.
 */
public class Runner {
    public static void main(String[] args) {


    Commodity commodity = new Commodity("milk",3000);

    AbstractPurchase[] abstractPurchases=new AbstractPurchase[6];

        abstractPurchases[0]=new FirstSubAbstractPurchase(commodity,4);
        abstractPurchases[1]=new FirstSubAbstractPurchase(commodity,2);
        abstractPurchases[2]=new SeconSsubAbstraktPurches(commodity,40);
        abstractPurchases[3]=new SeconSsubAbstraktPurches(commodity,2);
        abstractPurchases[4]=new ThirdSubAbstractPurchase(commodity,6,50000);
        abstractPurchases[5]=new ThirdSubAbstractPurchase(commodity,2,51000);

    Metods.printArr(abstractPurchases);
    Metods metods=new Metods();
        System.out.println("Minimum cost ="+metods.minCost(abstractPurchases));


        Arrays.sort(abstractPurchases);

        Metods.printArr(abstractPurchases);


    }}
